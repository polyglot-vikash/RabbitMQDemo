# RabbitMQDemo
A simple spring app to explore different usecases in RabbitMQ

# App
## rmqdemo
This is the producer app which sends a message to MyTopicExchange exchange with routing key "topic" when the app starts

## rmqdemolisten
This is the consumer app, which keeps listening to the messages sent to MyQueue queue. Since in the producer we have sent message to MyTopicExchange which forwards the message to MyQueue based on the bindings.
configuration: https://github.com/polyglot-vikash/RabbitMQDemo/blob/main/rmqdemolisten/src/main/java/com/rmq/rmqdemolisten/RabbitMQConfig.java
