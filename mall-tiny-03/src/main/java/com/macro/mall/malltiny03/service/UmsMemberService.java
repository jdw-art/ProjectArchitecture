package com.macro.mall.malltiny03.service;

import com.macro.mall.malltiny03.common.api.CommonResult;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 15:21
 * @Version: 1.0
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码喝手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
