package com.macro.mall.malltinyrabbit.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 16:30
 * @Version: 1.0
 */
public class TopicSender {
    @Autowired
    private RabbitTemplate template;

    private static final String exchangeName = "exchange.topic";

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicSender.class);


    private final String[] keys = {"quick.orange.rabbit", "lazy.orange.elephant", "quick.orange.fox",
            "lazy.brown.fox", "lazy.pink.rabbit", "quick.brown.fox"};

    public void send(int index) {
        StringBuilder builder = new StringBuilder("Hello to ");
        int limitIndex = index%keys.length;
        String key = keys[limitIndex];
        builder.append(key).append(' ');
        builder.append(index+1);
        for (int i = 0; i <= limitIndex; i++) {
            builder.append('.');
        }
        String message = builder.toString();
        template.convertAndSend(exchangeName, key, message);
        LOGGER.info(" [x] Sent '{}'",message);
        System.out.println(" [x] Sent '" + message + "'");
    }
}
