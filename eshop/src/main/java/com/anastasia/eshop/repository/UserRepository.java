package com.anastasia.eshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anastasia.eshop.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    

    List<User> findByPhone(String phone);

    List<User> findByFirstName(String firstName);

    List<User> findByLastName(String lastName);

    List<User> findByCityId(Long cityId);
   

}
