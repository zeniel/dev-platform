package com.devplatform.amqp.config;

import org.springframework.stereotype.Component;

import com.devplatform.amqp.Notification;
import com.google.gson.Gson;

@Component
public class RabbitMQListener {
    public void listen(byte[] message) {
        String msg = new String(message);
        Notification not = new Gson().fromJson(msg, Notification.class);
        System.out.println("Received a new notification...");
        System.out.println(not.toString());
    }
}
