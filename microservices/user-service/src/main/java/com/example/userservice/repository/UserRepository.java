package com.example.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.userservice.model.StoreUser;

import java.util.Optional;

public interface UserRepository extends MongoRepository<StoreUser, String> {
    Optional<StoreUser> findByUsername(String username);
}
