package com.ws.spring.ordersservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;

@Data
@Document
public class OrderLine {
    @Id
    private String id;
    @DBRef
    private Product product;
    @Min(value = 0)
    private int quantity;
    @Min(value = 0)
    private int lineTotal;
}
