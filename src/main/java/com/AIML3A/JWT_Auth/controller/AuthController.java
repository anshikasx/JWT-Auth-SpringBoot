package com.AIML3A.JWT_Auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.AIML3A.JWT_Auth.service.AuthService;
import com.AIML3A.JWT_Auth.model.User;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService service;

    // Register
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return service.register(user);
    }

    // Login
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return service.login(user.getUsername(), user.getPassword());
    }

    // Protected API
    @GetMapping("/hello")
    public String hello() {
        return "Hello! JWT Authentication Successful";
    }
    
    @GetMapping("/test")
    public String test() {
        return "API is working";
    }
}