package com.rmqdemo.rmqdemo;

import com.rmqdemo.rmqdemo.model.SimpleMessage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RmqdemoApplication implements CommandLineRunner {

	static Log log = LogFactory.getLog(RmqdemoApplication.class);

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {

		SpringApplication.run(RmqdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Starting the app..");

		// Not recommended, as it does not take queue and exchange info
		// rabbitTemplate.convertAndSend("Hello from our first message");


		rabbitTemplate.convertAndSend("test-exchange", "testRouting", "Hello from code");

		SimpleMessage message = new SimpleMessage("Simple message", "Simple description");
		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", message.toString());


	}
}
