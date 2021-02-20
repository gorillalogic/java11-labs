package com.ws.spring.cartservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.ws.spring.storeservice.model.Product;

@Data
@Document
public class CartProduct {
    @Id
    private String id;
    @DBRef
    private Product product;
    private String userId;
    private int quantity;
}
