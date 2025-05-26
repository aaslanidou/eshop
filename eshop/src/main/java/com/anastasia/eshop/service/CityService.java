package com.anastasia.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anastasia.eshop.model.City;
import com.anastasia.eshop.repository.CityRepository;

@Service
public class CityService {
  @Autowired
  private CityRepository cityRepository;

  public List<City> getAllCities() {
    List<City> cities = cityRepository.findAll();
    return cities;
  }

  public void createCity(String name) {
    City c = new City();
    c.setName(name);

    cityRepository.save(c);

  }

  public void saveCity(City city) {
    cityRepository.save(city);
  }

  public void deleteCity(Long id) {
    cityRepository.deleteById(id);
  }

  public City updateCity(Long id,City city){

   City existingCity= cityRepository.findById(id).orElseThrow(()->new RuntimeException("city not found"));
   existingCity.setName(city.getName());
    return cityRepository.save(existingCity);
  }

}
