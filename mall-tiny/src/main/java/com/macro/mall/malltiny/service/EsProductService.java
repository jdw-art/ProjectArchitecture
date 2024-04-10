package com.macro.mall.malltiny.service;

import com.macro.mall.malltiny.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/10 16:46
 * @Version: 1.0
 */
public interface EsProductService {

    int importAll();
    void delete(Long id);
    EsProduct create(Long id);
    void delete(List<Long> ids);
    Page<EsProduct> search(String keywords, Integer pageNum, Integer pageSize);
}
