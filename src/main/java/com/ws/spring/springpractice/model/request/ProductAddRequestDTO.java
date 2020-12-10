package com.ws.spring.springpractice.model.request;

import lombok.Data;

@Data
public class ProductAddRequestDTO {
    private String name;
    private int price;
    private int quantity;
}
