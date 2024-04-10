package com.macro.mall.malltinyswagger.service;

import com.macro.mall.malltinyswagger.domain.AdminUserDetails;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 20:18
 * @Version: 1.0
 */
public interface UmsAdminService {

    /**
     * 根据用户名获取用户信息
     */
    AdminUserDetails getAdminByUsername(String username);

    /**
     * 用户名密码登录
     */
    String login(String username, String password);
}
