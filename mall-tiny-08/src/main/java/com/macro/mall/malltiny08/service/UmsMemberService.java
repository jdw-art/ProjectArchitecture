package com.macro.mall.malltiny08.service;

import com.macro.mall.malltiny08.common.api.CommonResult;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 17:26
 * @Version: 1.0
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
