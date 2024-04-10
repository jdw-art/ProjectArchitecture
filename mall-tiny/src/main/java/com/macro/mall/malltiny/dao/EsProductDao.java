package com.macro.mall.malltiny.dao;

import com.macro.mall.malltiny.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/13 21:42
 * @Version: 1.0
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
