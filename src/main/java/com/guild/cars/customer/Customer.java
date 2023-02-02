package com.guild.cars.customer;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "street_one")
    private String streetOne;

    @Column(name = "city")
    private String city;

    @Column(name = "street_two")
    private String streetTwo;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "purchase_price")
    private double purchasePrice;

    @Column(name = "purchase_type")
    private String purchaseType;

    // getters and setters

    public Customer() {
    }

    public Customer(Long id, String name, String phone, String email, String streetOne, String city, String streetTwo, String state, String zipcode, double purchasePrice, String purchaseType) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.streetOne = streetOne;
        this.city = city;
        this.streetTwo = streetTwo;
        this.state = state;
        this.zipcode = zipcode;
        this.purchasePrice = purchasePrice;
        this.purchaseType = purchaseType;
    }

    public Customer(String name, String phone, String email, String streetOne, String city, String streetTwo, String state, String zipcode, double purchasePrice, String purchaseType) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.streetOne = streetOne;
        this.city = city;
        this.streetTwo = streetTwo;
        this.state = state;
        this.zipcode = zipcode;
        this.purchasePrice = purchasePrice;
        this.purchaseType = purchaseType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetOne() {
        return streetOne;
    }

    public void setStreetOne(String streetOne) {
        this.streetOne = streetOne;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetTwo() {
        return streetTwo;
    }

    public void setStreetTwo(String streetTwo) {
        this.streetTwo = streetTwo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", streetOne='" + streetOne + '\'' +
                ", city='" + city + '\'' +
                ", streetTwo='" + streetTwo + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", purchaseType='" + purchaseType + '\'' +
                '}';
    }
}

