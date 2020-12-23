package com.ws.spring.cartservice.repository;

import com.ws.spring.cartservice.model.CartProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CartProductRepository extends MongoRepository<CartProduct, String> {
    List<CartProduct> findByUserId(String userId);
}
