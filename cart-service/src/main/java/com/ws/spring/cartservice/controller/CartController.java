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

    @GetMapping("/{userId}")
    public ResponseEntity getCartContent(@PathVariable String userId){
        return ResponseEntity.ok(cartService.getCartProducts(userId));
    }

    @PostMapping("/{userId}")
    public ResponseEntity submitCartContent(@PathVariable String userId){
        cartService.submitCartContent(userId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/product/{cartProductId}")
    public ResponseEntity getCartProduct(@PathVariable String cartProductId){
        return ResponseEntity.ok(cartService.getCartProduct(cartProductId));
    }

    @PostMapping("/{userId}/product")
    public ResponseEntity addCartProduct(@RequestBody CartProductRequestDTO request){
        return ResponseEntity.ok(cartService.addCartProduct(request));
    }

    @PutMapping("/product/{cartProductId}")
    public ResponseEntity updateCartProduct(@PathVariable String cartProductId, @RequestBody CartProductRequestDTO request){
        return ResponseEntity.ok(cartService.editCartProduct(cartProductId, request));
    }

    @DeleteMapping("/product/{cartProductId}")
    public ResponseEntity deleteCartProduct(@PathVariable String cartProductId){
        cartService.deleteCartProduct(cartProductId);
        return ResponseEntity.ok().build();
    }
}
