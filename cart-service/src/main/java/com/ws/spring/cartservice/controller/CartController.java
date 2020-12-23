package com.ws.spring.cartservice.controller;

import com.ws.spring.cartservice.model.request.CartProductRequestDTO;
import com.ws.spring.cartservice.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @GetMapping("/cart/{userId}")
    public ResponseEntity getCartContent(@PathVariable String userId){
        return ResponseEntity.ok(cartService.getCartProducts(userId));
    }

    @PostMapping("/cart/{userId}")
    public ResponseEntity submitCartContent(@PathVariable String userId){
        cartService.submitCartContent(userId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/cart/product/{cartProductId}")
    public ResponseEntity getCartProduct(@PathVariable String cartProductId){
        return ResponseEntity.ok(cartService.getCartProduct(cartProductId));
    }

    @PostMapping("/cart/{userId}/product")
    public ResponseEntity addCartProduct(@RequestBody CartProductRequestDTO request){
        return ResponseEntity.ok(cartService.addCartProduct(request));
    }

    @PutMapping("/cart/product/{cartProductId}")
    public ResponseEntity updateCartProduct(@PathVariable String cartProductId, @RequestBody CartProductRequestDTO request){
        return ResponseEntity.ok(cartService.editCartProduct(cartProductId, request));
    }

    @DeleteMapping("/cart/product/{cartProductId}")
    public ResponseEntity deleteCartProduct(@PathVariable String cartProductId){
        cartService.deleteCartProduct(cartProductId);
        return ResponseEntity.ok().build();
    }
}
