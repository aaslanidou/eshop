package com.anastasia.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anastasia.eshop.model.User;
import com.anastasia.eshop.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        userService.saveUser(user);
        
        return ResponseEntity.ok("User created successfully");
    }
    

}
