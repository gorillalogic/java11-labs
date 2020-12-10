package com.ws.spring.springpractice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Product {
    @Id
    private String id;
    private String name;
    private int price;
    private int quantity;
}
