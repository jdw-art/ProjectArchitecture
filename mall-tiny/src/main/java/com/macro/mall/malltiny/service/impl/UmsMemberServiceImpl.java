package com.macro.mall.malltiny.service.impl;

import cn.hutool.core.util.StrUtil;
import com.macro.mall.malltiny.common.api.CommonResult;
import com.macro.mall.malltiny.service.RedisService;
import com.macro.mall.malltiny.service.UmsMemberService;
import org.apache.http.auth.AUTH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author: Jacob
 * @Description: 会员管理实现类Service
 * @Date: 2024/2/9 15:22
 * @Version: 1.0
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private RedisService redisService;
    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public CommonResult generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return CommonResult.success(sb.toString());
    }

    @Override
    public CommonResult verifyAuthCode(String telephone, String authCode) {
        if (StrUtil.isEmpty(authCode)) {
            return CommonResult.failed("请输入验证码");
        }
        String realAuthCode = (String) redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        boolean result = authCode.equals(realAuthCode);
        if (result) {
            return CommonResult.success(null, "验证码校验成功");
        } else {
            return CommonResult.failed("验证码不正确");
        }
    }
}
