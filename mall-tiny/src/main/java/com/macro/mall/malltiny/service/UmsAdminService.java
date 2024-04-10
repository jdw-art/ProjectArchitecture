package com.macro.mall.malltiny.service;

import com.macro.mall.malltiny.domain.AdminUserDetails;
import com.macro.mall.malltiny.domain.UmsResource;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/10 13:55
 * @Version: 1.0
 */
public interface UmsAdminService {
    AdminUserDetails getAdminByUsername(String username);
    List<UmsResource> getResourceList();
    String login(String username, String password);
}
