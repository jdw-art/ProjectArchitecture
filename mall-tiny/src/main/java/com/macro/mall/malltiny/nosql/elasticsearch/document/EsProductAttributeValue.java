package com.macro.mall.malltiny.nosql.elasticsearch.document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/10 16:35
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    @Field(type = FieldType.Keyword)
    private String value;
    private Integer type;
    @Field(type = FieldType.Keyword)
    private String name;
}
