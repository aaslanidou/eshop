package com.anastasia.eshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ProductCategories")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED")
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    public ProductCategory() {
    }

    public ProductCategory(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

}
