package com.guild.cars.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

@SuppressWarnings("ALL")
@Entity
public class Car {
    @Id
    private String vin;
    private String make;
    private String type;
    private int year;
    private String color;
    private int milage;
    private double msrp;
    private String model;
    private String bodyStyle;
    private String transmission;
    private String interior;
    private double salesPrice;
    private String description;
    private byte[] picture;

    // ... getters and setters

    public Car() {
    }

    public Car(String vin,
               String make,
               String type,
               int year,
               String color,
               int milage,
               double msrp,
               String model,
               String bodyStyle,
               String transmission,
               String interior,
               double salesPrice,
               String description,
               byte[] picture) {
        this.vin = vin;
        this.make = make;
        this.type = type;
        this.year = year;
        this.color = color;
        this.milage = milage;
        this.msrp = msrp;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.transmission = transmission;
        this.interior = interior;
        this.salesPrice = salesPrice;
        this.description = description;
        this.picture = picture;
    }

    public Car(String make,
               String type,
               int year,
               String color,
               int milage,
               double msrp,
               String model,
               String bodyStyle,
               String transmission,
               String interior,
               double salesPrice,
               String description,
               byte[] picture) {
        this.make = make;
        this.type = type;
        this.year = year;
        this.color = color;
        this.milage = milage;
        this.msrp = msrp;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.transmission = transmission;
        this.interior = interior;
        this.salesPrice = salesPrice;
        this.description = description;
        this.picture = picture;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", milage=" + milage +
                ", msrp=" + msrp +
                ", model='" + model + '\'' +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", transmission='" + transmission + '\'' +
                ", interior='" + interior + '\'' +
                ", salesPrice=" + salesPrice +
                ", description='" + description + '\'' +
                ", picture=" + Arrays.toString(picture) +
                '}';
    }
}

