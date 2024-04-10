package com.macro.mall.malltiny05.dao;

import com.macro.mall.malltiny05.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/6 15:12
 * @Version: 1.0
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
