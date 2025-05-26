package com.anastasia.eshop.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.anastasia.eshop.model.City;

public interface CityRepository extends JpaRepository<City, Long> {
   List<City> findByName(String name);
   

}
