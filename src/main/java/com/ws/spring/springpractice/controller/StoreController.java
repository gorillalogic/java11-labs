package com.ws.spring.springpractice.controller;

import com.ws.spring.springpractice.model.Product;
import com.ws.spring.springpractice.model.request.ProductAddRequestDTO;
import com.ws.spring.springpractice.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;

    @GetMapping("/hello")
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/product")
    public ResponseEntity listProducts(){
        return ResponseEntity.ok(storeService.listProducts());
    }

    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody ProductAddRequestDTO request){
        return ResponseEntity.ok(storeService.addProduct(request));
    }


}
