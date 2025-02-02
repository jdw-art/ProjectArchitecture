package com.macro.mall.malltinymybatis.dao;

import com.macro.mall.malltinymybatis.model.UmsAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 12:44
 * @Version: 1.0
 */
@Repository
public interface UmsAdminDao {

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    UmsAdmin selectByIdSimple(Long id);

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    UmsAdmin selectById(Long id);

    /**
     * 插入用户
     */
    int insert(UmsAdmin entity);

    /**
     * 根据ID修改用户信息
     */
    int updateById(UmsAdmin entity);

    /**
     * 根据ID删除用户
     */
    int deleteById(Long id);

    // 动态SQL---------------------------------------------

    /**
     * 根据用户名和Email模糊查询用户
     * 不输入查询所有
     */
    List<UmsAdmin> selectByUsernameAndEmailLike(@Param("username") String username, @Param("email") String email);

    /**
     * 根据用户名和Email模糊查询用户
     * 不输入不返回数据
     */
    List<UmsAdmin> selectByUsernameAndEmailLike2(@Param("username") String username, @Param("email") String email);

    /**
     * 根据用户名和Email模糊查询用户
     * 不输入查询所有
     */
    List<UmsAdmin> selectByUsernameAndEmailLike3(@Param("username") String username,@Param("email") String email);

    /**
     * 根据ID选择性修改用户信息
     */
    int updateByIdSelective(UmsAdmin entity);

    /**
     * 批量插入用户
     */
    int insertBatch(@Param("entityList") List<UmsAdmin> adminList);

    /**
     * 根据用户ID批量查询
     */
    List<UmsAdmin> selectByIds(@Param("ids") List<Long> ids);

}
