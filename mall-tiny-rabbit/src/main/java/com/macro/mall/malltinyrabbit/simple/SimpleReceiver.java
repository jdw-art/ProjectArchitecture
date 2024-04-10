package com.macro.mall.malltinyrabbit.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 15:48
 * @Version: 1.0
 */
@RabbitListener(queues = "simple.hello")
public class SimpleReceiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleReceiver.class);

    @RabbitHandler
    public void receive(String in) {
        LOGGER.info(" [x] Received '{}'", in);
    }
}
