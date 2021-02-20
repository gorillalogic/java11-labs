package com.ws.spring.userservice.controller;

import com.ws.spring.userservice.model.request.UserCreateDTO;
import com.ws.spring.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
//@RequestMapping(value = "/api/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/api/user")
    public ResponseEntity createUser(@RequestBody UserCreateDTO userCreateRequest){
        userService.createUser(userCreateRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("verify")
    public ResponseEntity verify(){
        return ResponseEntity.ok().build();
    }
}
