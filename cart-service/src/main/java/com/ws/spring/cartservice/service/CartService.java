package com.ws.spring.cartservice.service;

import com.ws.spring.cartservice.model.CartProduct;
import com.ws.spring.cartservice.repository.CartProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartProductRepository cartProductRepository;

    public List<CartProduct> getCartProducts(String userId){
        return cartProductRepository.findByUserId(userId);
    }
}
