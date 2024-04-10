package com.macro.mall.malltiny.service;

import com.macro.mall.malltiny.common.api.CommonResult;

/**
 * @Author: Jacob
 * @Description: 会员管理service
 * @Date: 2024/2/9 15:21
 * @Version: 1.0
 */
public interface UmsMemberService {

    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone, String authCode);
}
