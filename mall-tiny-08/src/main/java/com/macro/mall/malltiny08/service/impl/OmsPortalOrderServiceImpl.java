package com.macro.mall.malltiny08.service.impl;

import com.macro.mall.malltiny08.common.api.CommonResult;
import com.macro.mall.malltiny08.commponent.CancelOrderSender;
import com.macro.mall.malltiny08.dto.OrderParam;
import com.macro.mall.malltiny08.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 19:58
 * @Version: 1.0
 */
@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {

    private static Logger LOGGER = LoggerFactory.getLogger(OmsPortalOrderService.class);

    @Autowired
    private CancelOrderSender cancelOrderSender;

    @Override
    public CommonResult generateOrder(OrderParam orderParam) {
        //TODO 执行一系列下单操作
        LOGGER.info("process generateOrder");
        // 下单完成后开启一个延迟消息，用于用户没有付款时取消订单（orderId应该在下单后生成）
        sendDelayMessageCancelOrder(11L);
        return CommonResult.success(null, "下单成功");
    }

    @Override
    public void cancelOrder(Long orderId) {
        // TODO 执行一系列取消订单操作
        LOGGER.info("process cancelOrder orderId:{}", orderId);
    }

    private void sendDelayMessageCancelOrder(Long orderId) {
        //获取订单超时时间，假设为60分钟(测试用的30秒)
        long delayTimes = 30 * 1000;
        //发送延迟消息
        cancelOrderSender.sendMessage(orderId, delayTimes);
    }
}
