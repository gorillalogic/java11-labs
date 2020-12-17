package com.ws.spring.cartservice.model.request;

import lombok.Data;

@Data
public class CartProductRequestDTO {
    private String id;
    private String productId;
    private String userId;
}
