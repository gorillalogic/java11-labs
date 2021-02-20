package com.ws.spring.userservice.service;

import com.ws.spring.userservice.model.StoreUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class AuthenticationUserDetailService implements UserDetailsService {
    private final UserService userService;

    @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        StoreUser user = userService.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), Collections.emptyList());
    }
}
