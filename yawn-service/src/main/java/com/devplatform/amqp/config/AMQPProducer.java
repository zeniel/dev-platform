package com.devplatform.amqp.config;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devplatform.amqp.Notification;

@Component
public class AMQPProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    YawnProperties rabbitMQProperties;
    
    public interface ROUTINGKEYSUFFIX {
    	String GITLAB = ".gitlab";
    	String JIRA = ".jira";
    	String SLACK = ".slack";
    	String CRAWLER = ".crawler";
    }

    public void sendMessage(Notification msg){
        System.out.println("Send msg = " + msg.toString());
        rabbitTemplate.convertAndSend(rabbitMQProperties.getExchangeName(), rabbitMQProperties.getRoutingKeyPrefix(), msg);
    }

    public void sendMessageGeneric(Object msg, String serviceEvent, String eventType){
    	String routingKey = rabbitMQProperties.getRoutingKeyPrefix()
															.concat(".")
															.concat(serviceEvent)
															.concat(".")
															.concat(eventType);
    	
        System.out.println("Send Generic msg with routingkey: ["+ routingKey + "] = " + msg.toString());
        rabbitTemplate.convertAndSend(rabbitMQProperties.getExchangeName(), routingKey ,msg);
    }

}