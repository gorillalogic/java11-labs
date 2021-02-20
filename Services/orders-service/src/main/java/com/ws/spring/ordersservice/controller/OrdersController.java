package com.ws.spring.ordersservice.controller;

import com.ws.spring.ordersservice.model.Order;
import com.ws.spring.ordersservice.model.request.OrderRequestDTO;
import com.ws.spring.ordersservice.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/api/order")
@RequiredArgsConstructor
public class OrdersController {
    private final OrdersService ordersService;

    @GetMapping("/{userId}")
    public ResponseEntity listOrders(@PathVariable String userId){
        return ResponseEntity.ok(ordersService.findOrders(userId));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable String orderId){
        //TODO: return order
        return ResponseEntity.ok().build();
    }

    @PostMapping()
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequestDTO request){
        //TODO: create order
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<Order> modifyOrder(@PathVariable String orderId, @RequestBody OrderRequestDTO request){
        //TODO: modify order
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity deleteOrder(@PathVariable String orderId){
        //delete
        return ResponseEntity.ok().build();
    }
}
