package com.ws.spring.storeservice.controller;

import com.ws.spring.storeservice.model.Product;
import com.ws.spring.storeservice.model.request.ProductRequestDTO;
import com.ws.spring.storeservice.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/api/store")
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

    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable String productId){
        return ResponseEntity.ok(storeService.findById(productId));
    }

    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody ProductRequestDTO request){
        return ResponseEntity.ok(storeService.addProduct(request));
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<Product> upddateProduct(@RequestBody ProductRequestDTO request, @PathVariable String productId){
        return ResponseEntity.ok(storeService.updateProduct(productId, request));
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity deleteProduct(@PathVariable String productId){
        storeService.deleteProduct(productId);
        return ResponseEntity.ok().build();
    }
}
