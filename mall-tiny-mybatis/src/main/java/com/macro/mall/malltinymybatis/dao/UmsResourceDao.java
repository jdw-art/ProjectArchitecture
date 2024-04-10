package com.macro.mall.malltinymybatis.dao;

import com.macro.mall.malltinymybatis.domain.UmsResourceExt;
import com.macro.mall.malltinymybatis.model.UmsResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 17:09
 * @Version: 1.0
 */
@Repository
public interface UmsResourceDao {

    /**
     * 根据资源ID获取资源分类信息
     */
    UmsResourceExt selectResourceWithCategory(Long id);

    /**
     * 根据资源ID获取资源及分类信息
     */
    UmsResourceExt selectResourceWithCategory2(Long id);

    /**
     * 根据分类ID查询资源
     */
    List<UmsResource> selectListByCategoryId(Long categoryId);
}
