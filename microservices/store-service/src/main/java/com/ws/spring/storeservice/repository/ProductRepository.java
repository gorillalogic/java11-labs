package com.ws.spring.storeservice.repository;

import com.ws.spring.storeservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product, String> {
}
