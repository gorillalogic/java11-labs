package com.example.cartservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.example.common.model.Product;

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
