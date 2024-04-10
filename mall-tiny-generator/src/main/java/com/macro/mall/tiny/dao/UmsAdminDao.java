package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.domain.AdminRoleDto;
import com.macro.mall.tiny.domain.ResourceWithCateDto;
import com.macro.mall.tiny.domain.RoleStatDto;
import com.macro.mall.tiny.mbg.model.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 20:51
 * @Version: 1.0
 */
public interface UmsAdminDao {

    List<UmsAdmin> subList(@Param("roleId") Long roleId);

    List<RoleStatDto> groupList();

    AdminRoleDto selectWithRoleList(@Param("id") Long id);

    ResourceWithCateDto selectResourceWithCate(@Param("id")Long id);

}
