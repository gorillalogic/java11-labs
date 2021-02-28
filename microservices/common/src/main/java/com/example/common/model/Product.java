package com.example.common.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;

@Data
@Document
public class Product {
    @Id
    private String id;
    private String name;
    @Min(value = 0)
    private int price;
    @Min(value = 0)
    private int quantity;
}