package com.ws.spring.userservice.model.request;

import lombok.Data;

@Data
public class UserCreateDTO {
    private String username;
    private String password;
}
