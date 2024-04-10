package com.macro.mall.malltinymybatis.dao;

import com.macro.mall.malltinymybatis.domain.UmsResourceCategoryExt;
import org.springframework.stereotype.Repository;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 17:19
 * @Version: 1.0
 */
@Repository
public interface UmsResourceCategoryDao {

    /**
     * 根据分类ID获取分类及对应资源
     */
    UmsResourceCategoryExt selectCategoryWithResource(Long id);

}
