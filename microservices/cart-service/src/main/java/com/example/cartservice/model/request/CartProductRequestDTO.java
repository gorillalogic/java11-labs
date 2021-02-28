package com.example.cartservice.model.request;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Min;

@Data
public class CartProductRequestDTO {
    private String id;
    @NotNull
    private String productId;
    @NotNull
    private String userId;
    @Min(value = 1)
    private int quantity;
}
