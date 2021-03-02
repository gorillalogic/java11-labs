package com.example.userservice.controller;

import com.example.userservice.model.request.UserCreateDTO;
import com.example.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
//@RequestMapping(value = "/api/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/health")
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/user")
    public ResponseEntity createUser(@RequestBody UserCreateDTO userCreateRequest){
        userService.createUser(userCreateRequest);
        return ResponseEntity.ok().build();
    }
}
