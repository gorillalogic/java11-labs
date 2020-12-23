package com.ws.spring.ordersservice.service;

import com.ws.spring.ordersservice.model.Order;
import com.ws.spring.ordersservice.repository.OrdersRepository;
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
