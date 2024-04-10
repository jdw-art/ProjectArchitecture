package com.macro.mall.malltinyrabbit.work;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 16:06
 * @Version: 1.0
 */
@Configuration
public class WorkRabbitConfig {

    @Bean
    public Queue workQueue() {
        return new Queue("work.hello");
    }

    @Bean
    public WorkReceiver workReceiver1() {
        return new WorkReceiver(1);
    }

    @Bean
    public WorkReceiver workReceiver2() {
        return new WorkReceiver(2);
    }

    @Bean
    public WorkSender workSender() {
        return new WorkSender();
    }

}
