package com.devplatform.amqp.config;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.devplatform.amqp.Notification;
import com.google.gson.Gson;

@Component
public class RabbitMQListener {
	
	public static final String EXCHANGE_NAME = "dev-platform-exchange"; 
	
	@RabbitListener(
			bindings = @QueueBinding(
				value = @Queue(value = "${yawn.queue-name-default}", durable = "true", autoDelete = "false", exclusive = "false"), 
				exchange = @Exchange(value = "{yawn.exchange-name}", type = ExchangeTypes.TOPIC), 
				key = "#{yawn.routing-key-prefix}")
	)
    public void listen(byte[] message) {
        String msg = new String(message);
        Notification not = new Gson().fromJson(msg, Notification.class);
        System.out.println("Received a new notification...");
        System.out.println(not.toString());
    }
}
