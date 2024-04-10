package com.macro.mall.malltiny08.nosql.mongodb.document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 10:55
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode
@Document
public class MemberReadHistory {

    @Id
    private String id;
    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    @Indexed
    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;
}
