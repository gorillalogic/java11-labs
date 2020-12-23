package com.ws.spring.cartservice.repository;

import com.ws.spring.cartservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product, String> {
}
