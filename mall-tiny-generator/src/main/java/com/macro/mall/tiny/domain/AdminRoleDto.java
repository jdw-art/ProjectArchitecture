package com.macro.mall.tiny.domain;

import com.macro.mall.tiny.mbg.model.UmsAdmin;
import com.macro.mall.tiny.mbg.model.UmsRole;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 12:53
 * @Version: 1.0
 */
public class AdminRoleDto extends UmsAdmin {
    private List<UmsRole> roleList;

    public List<UmsRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<UmsRole> roleList) {
        this.roleList = roleList;
    }
}
