package com.anastasia.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anastasia.eshop.model.ProductCategory;
import com.anastasia.eshop.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> getALLProductCategory (){
        return productCategoryRepository.findAll();
    }


    public void creatProductCategory(String name){
        ProductCategory p = new ProductCategory();
        p.setName(name);
        productCategoryRepository.save(p);
        
    }

    public void deleteProductCategory(Long id){
        if(!productCategoryRepository.existsById(id)){
            throw new RuntimeException("Product Category doesn't exists");
          }
          productCategoryRepository.deleteById(id);
    }
        
    

}
