package com.anastasia.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anastasia.eshop.model.City;
import com.anastasia.eshop.service.CityService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cities")
public class CityController {
  @Autowired
  private CityService cityService;

  @GetMapping
  public ResponseEntity<?> getAll() {
    try {
      List<City> response = cityService.getAllCities();
      return ResponseEntity
          .ok()
          .body(response);
    } catch (Throwable t) {
      return ResponseEntity
          .internalServerError()
          .body(t.getMessage());
    }
  }

  @PostMapping("/create")
  public ResponseEntity<String> createCity(@RequestBody City city) {
    cityService.saveCity(city);

    return ResponseEntity.ok("City created successfully");
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteCity(@PathVariable("id") Long id) {
    try {
      cityService.deleteCity(id);

      return ResponseEntity.ok("City deleted successfully");
    } catch (Throwable t) {
      return ResponseEntity.badRequest().body(t.getMessage());
    }
  }

}
