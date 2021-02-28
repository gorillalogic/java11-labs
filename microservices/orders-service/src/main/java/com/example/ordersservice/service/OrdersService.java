package com.example.ordersservice.service;

import com.example.ordersservice.model.Order;
import com.example.ordersservice.repository.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersService {
    private final OrdersRepository ordersRepository;

    public List<Order> findOrders(String userId){
        return ordersRepository.findByUserId(userId);
    }

}
