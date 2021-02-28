package com.example.userservice.service;

import com.example.userservice.model.request.UserCreateDTO;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.exception.EntityNotFoundException;
import com.example.userservice.model.StoreUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public StoreUser getUserByUsername(String username){
        Optional<StoreUser> optionalUser = userRepository.findByUsername(username);
        if(optionalUser.isPresent()){
            return optionalUser.get();
        }
        throw new EntityNotFoundException("User not found");
    }

    public void createUser(UserCreateDTO userRequest){
        StoreUser user = new StoreUser();
        Optional<StoreUser> optionalUser = userRepository.findByUsername(userRequest.getUsername());
        if(optionalUser.isPresent()){
            throw new RuntimeException("Username already exists, please use different username.");
        }
        user.setUsername(userRequest.getUsername());
        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        userRepository.save(user);
    }
}
