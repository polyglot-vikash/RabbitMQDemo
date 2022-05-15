package com.rmq.rmqdemolisten;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfig {
    @Bean
    Exchange createExchange() {
        return new TopicExchange("ExampleExchange");
    }

    // declarative way
    @Bean
    Exchange exampleSecondExchange() {
        return ExchangeBuilder.directExchange("ExampleSecondExchange").
                autoDelete().
                internal().build();
    }

    @Bean
    Exchange newExchnage() {
        return ExchangeBuilder.topicExchange("TopicTestExchange").autoDelete().durable(true).internal().build();
    }

    @Bean
    Exchange fanoutExchange() {
        return ExchangeBuilder.fanoutExchange("FanoutTestExchange").internal().durable(true).ignoreDeclarationExceptions().build();
    }

    @Bean
    Exchange headersExchange() {
        return ExchangeBuilder.headersExchange("HeadersTestExchange").internal().durable(true).autoDelete().build();
    }
}
