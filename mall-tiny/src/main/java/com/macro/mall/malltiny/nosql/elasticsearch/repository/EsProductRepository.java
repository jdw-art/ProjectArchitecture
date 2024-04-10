package com.macro.mall.malltiny.nosql.elasticsearch.repository;

import com.macro.mall.malltiny.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/10 16:40
 * @Version: 1.0
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {

    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}
