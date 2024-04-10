package com.macro.mall.malltiny08.commponent;

import com.macro.mall.malltiny08.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 19:51
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(CancelOrderReceiver.class);

    @Autowired
    private OmsPortalOrderService portalOrderService;

    @RabbitHandler
    public void handle(Long orderId) {
        LOGGER.info("receive delay message orderId:{}", orderId);
        portalOrderService.cancelOrder(orderId);
    }
}
