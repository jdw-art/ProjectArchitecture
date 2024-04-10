package com.macro.mall.malltiny08.dto;

import lombok.Data;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 19:57
 * @Version: 1.0
 */
@Data
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}
