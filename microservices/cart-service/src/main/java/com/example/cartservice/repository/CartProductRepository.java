package com.example.cartservice.repository;

import com.example.cartservice.model.CartProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CartProductRepository extends MongoRepository<CartProduct, String> {
    List<CartProduct> findByUserId(String userId);
}
