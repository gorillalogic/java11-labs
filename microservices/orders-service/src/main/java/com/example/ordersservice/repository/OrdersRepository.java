package com.example.ordersservice.repository;

import com.example.ordersservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrdersRepository extends MongoRepository<Order, String> {
    List<Order> findByUserId(String userId);
}
