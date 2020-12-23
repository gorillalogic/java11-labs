package com.ws.spring.storeservice.model;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;

@Data
@Document
public class Product {
    @Id
    private String id;
    @NotNull
    private String name;
    @Min(value = 0)
    private int price;
    @Min(value = 0)
    private int quantity;
}