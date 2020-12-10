package com.ws.spring.springpractice.repository;

import com.ws.spring.springpractice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product, String> {
}
