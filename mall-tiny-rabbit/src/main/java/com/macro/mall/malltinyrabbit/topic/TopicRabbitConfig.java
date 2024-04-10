package com.macro.mall.malltinyrabbit.topic;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 16:30
 * @Version: 1.0
 */
@Configuration
public class TopicRabbitConfig {
    @Bean
    public TopicExchange topic() {
        return new TopicExchange("exchange.topic");
    }

    @Bean
    public Queue topicQueue1() {
        return new AnonymousQueue();
    }

    @Bean
    public Queue topicQueue2() {
        return new AnonymousQueue();
    }

    @Bean
    public Binding topicBinding1a(TopicExchange topic, Queue topicQueue1) {
        return BindingBuilder.bind(topicQueue1).to(topic).with("*.orange.*");
    }

    @Bean
    public Binding topicBinding2a(TopicExchange topic, Queue topicQueue2) {
        return BindingBuilder.bind(topicQueue2).to(topic).with("*.*.rabbit");
    }

    @Bean
    public Binding topicBinding2b(TopicExchange topic, Queue topicQueue2) {
        return BindingBuilder.bind(topicQueue2).to(topic).with("lazy.#");
    }

    @Bean
    public TopicReceiver topicReceiver() {
        return new TopicReceiver();
    }

    @Bean
    public TopicSender topicSender() {
        return new TopicSender();
    }
}
