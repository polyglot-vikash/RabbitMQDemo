package com.rmq.rmqdemolisten;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQListener implements MessageListener {
    private Log log = LogFactory.getLog(this.getClass());

    @Override
    public void onMessage(Message message) {

        // Body will return byte array
        log.info(new String(message.getBody()));
    }
}
