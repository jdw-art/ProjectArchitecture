package com.macro.mall.malltinyrabbit.simple;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 15:41
 * @Version: 1.0
 */
@Configuration
public class SimpleRabbitConfig {

    @Bean
    public Queue hello() {
        return new Queue("simple.hello");
    }

    @Bean
    public SimpleSender simpleSender() {
        return new SimpleSender();
    }

    @Bean
    public SimpleReceiver simpleReceiver() {
        return new SimpleReceiver();
    }
}
