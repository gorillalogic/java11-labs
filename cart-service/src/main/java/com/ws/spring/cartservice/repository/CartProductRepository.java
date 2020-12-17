package com.ws.spring.cartservice.repository;

import com.ws.spring.cartservice.model.CartProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CartProductRepository extends MongoRepository<CartProduct, String> {
    List<CartProduct> findByUserId(String userId);
}
