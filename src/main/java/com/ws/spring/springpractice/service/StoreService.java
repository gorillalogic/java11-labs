package com.ws.spring.springpractice.service;

import com.ws.spring.springpractice.model.Product;
import com.ws.spring.springpractice.model.request.ProductAddRequestDTO;
import com.ws.spring.springpractice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final ProductRepository productRepository;

    public List<Product> listProducts(){
        return productRepository.findAll();
    }

    public Product addProduct (ProductAddRequestDTO request){
        Product product = new Product();
        BeanUtils.copyProperties(request, product);
        return productRepository.save(product);
    }
}
