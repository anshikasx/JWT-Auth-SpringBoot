package com.AIML3A.JWT_Auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AIML3A.JWT_Auth.repository.UserRepository;
import com.AIML3A.JWT_Auth.security.JwtUtil;
import com.AIML3A.JWT_Auth.model.User;

@Service
public class AuthService {

    @Autowired
    UserRepository repo;

    @Autowired
    JwtUtil jwtUtil;

    // Register User
    public String register(User user) {
        repo.save(user);
        return "User Registered Successfully";
    }

    // Login User
    public String login(String username, String password) {

        var user = repo.findByUsername(username);

        if(user != null && user.getPassword().equals(password)) {
            return jwtUtil.generateToken(username);
        }

        return "Invalid Credentials";
    }
}