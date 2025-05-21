package com.anastasia.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anastasia.eshop.model.User;
import com.anastasia.eshop.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    User user = new User();

  

    public void saveUser(User user){
        
        userRepository.save(user);
    }

}
