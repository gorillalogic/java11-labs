package com.example.ordersservice.model;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import java.util.List;

@Data
@Document
public class Order {
    @Id
    private String id;
    @NotNull
    private String userId;
    private List<OrderLine> lines;
    @Min(value = 0)
    private int orderTotal;
    private String address;
}
