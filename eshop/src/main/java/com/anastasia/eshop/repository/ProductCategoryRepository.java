package com.anastasia.eshop.repository;

import java.util.List;
import com.anastasia.eshop.model.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long>{
    List<ProductCategory> findByName(String name);
    
    

}
