package com.ws.spring.storeservice.model.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class ProductRequestDTO {
    private String id;
    @NotNull
    private String name;
    @Min(value = 0)
    private int price;
    @Min(value = 0)
    private int quantity;
}
