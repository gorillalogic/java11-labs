package com.ws.spring.storeservice.service;

import com.ws.spring.storeservice.exception.EntityNotFoundException;
import com.ws.spring.storeservice.model.Product;
import com.ws.spring.storeservice.model.request.ProductRequestDTO;
import com.ws.spring.storeservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final ProductRepository productRepository;

    public List<Product> listProducts(){
        return productRepository.findAll();
    }

    public Product addProduct(ProductRequestDTO request){
        Product product = new Product();
        BeanUtils.copyProperties(request, product);
        return productRepository.save(product);
    }

    public Product findById(String id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }
        throw new EntityNotFoundException("Product not present in the database");
    }

    public Product updateProduct(String id, ProductRequestDTO request){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(!optionalProduct.isPresent()){
            throw new EntityNotFoundException("Product not present in the database");
        }
        Product product = optionalProduct.get();
        BeanUtils.copyProperties(request, product);
        return productRepository.save(product);
    }

    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }
}
