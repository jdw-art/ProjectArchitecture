package com.macro.mall.malltiny07.service;

import com.macro.mall.malltiny07.domain.AdminUserDetails;
import com.macro.mall.malltiny07.domain.UmsResource;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 后台用户管理Service
 * @Date: 2024/2/5 17:08
 * @Version: 1.0
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取用户信息
     */
    AdminUserDetails getAdminByUsername(String username);

    /**
     * 获取所以权限列表
     */
    List<UmsResource> getResourceList();

    /**
     * 用户名密码登录
     */
    String login(String username, String password);
}
