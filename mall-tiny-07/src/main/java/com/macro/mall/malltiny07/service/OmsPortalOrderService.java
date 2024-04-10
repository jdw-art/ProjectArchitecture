package com.macro.mall.malltiny07.service;

import com.macro.mall.malltiny07.common.api.CommonResult;
import com.macro.mall.malltiny07.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 19:56
 * @Version: 1.0
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
