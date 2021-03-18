package com.example.ordersservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    @KafkaListener(id = "group_orders", topics = "orders")
    public void consumeOrder(String message){
        System.out.println(message);
    }
}
