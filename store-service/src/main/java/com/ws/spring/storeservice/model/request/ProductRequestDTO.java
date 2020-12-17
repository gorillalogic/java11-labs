package com.ws.spring.storeservice.model.request;

import lombok.Data;

@Data
public class ProductRequestDTO {
    private String id;
    private String name;
    private int price;
    private int quantity;
}
