package com.anastasia.eshop.model;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED")
    private Long id;

    @Column(nullable=false,length  =255)
    private String title;

    @Column(columnDefinition="TEXT",nullable=false)
    private String description;

    @Column(nullable= false)
    private double price;

    @ManyToOne
    @JoinColumn(name="category_id", nullable= false)
    private ProductCategory category;

    public Product(){}
    public Product(String t,String d,double p){
        this.title=t;
        this.description=d;
        this.price=p;
    }
    //getter setter title
    public String getTitle(){
        return title;
    }

    public void setTitle(String t){
        this.title=t;
    }


    //getter setter description

    public String getDescription(){
        return description;
    }

    public void setDescription(String d){
        this.description=d;
    }

    //getter setter price

     public double getPrice(){
        return price;
    }

    public void setTitle(double p){
        this.price=p;
    }


}
