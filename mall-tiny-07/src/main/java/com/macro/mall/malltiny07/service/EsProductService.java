package com.macro.mall.malltiny07.service;

import com.macro.mall.malltiny07.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 商品搜索管理Service
 * @Date: 2024/2/6 15:03
 * @Version: 1.0
 */
public interface EsProductService {
    /**
     * 从数据库中导入所有商品到ES
     */
    int importAll();

    /**
     * 根据ID删除商品
     */
    void delete(Long id);

    /**
     * 根据ID创建商品
     */
    EsProduct create(Long id);

    /**
     * 批量删除商品
     */
    void delete(List<Long> ids);

    /**
     * 根据关键字搜索名称或副标题
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

}
