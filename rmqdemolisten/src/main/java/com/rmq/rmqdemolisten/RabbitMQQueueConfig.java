package com.rmq.rmqdemolisten;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfig {

    // create a queue
    @Bean
    Queue exampleQueue() {
        return new Queue("ExampleQueue", false);
    }

    // create a queue using builder pattern
    @Bean
    Queue exampleSecondQueue() {
        return QueueBuilder.durable("ExampleSecondQueue").exclusive().autoDelete().build();
    }
}
