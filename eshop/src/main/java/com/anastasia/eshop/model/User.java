package com.anastasia.eshop.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED")
    private Long id;

    @Column(nullable=false)
    private String firstName;

    @Column(nullable=false)
    private String lastName;

    @Column(nullable=false)
    private String address;

    @Column(nullable=false)
    private String phone;

    @Column(nullable=false)
    private String username;

    @Column(nullable=false)
    private String password;
    
    
    @Column(nullable=true)
    private int cityId;

public User(){}
public User(String firstname,String lastname,String address,String phone,String username,String password,int cityId){
    this.firstName=firstname;
    this.lastName=lastname;
    this.address=address;
    this.phone=phone;
    this.username=username;
    this.password=password;
    this.cityId=cityId;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}    

public int getCity(){
    return cityId;
}

public void setCity(int cityId){
    this.cityId=cityId;
}





















}

