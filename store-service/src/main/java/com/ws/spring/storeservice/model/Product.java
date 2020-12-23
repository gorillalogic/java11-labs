package com.ws.spring.storeservice.model;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
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