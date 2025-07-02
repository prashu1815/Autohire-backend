package com.CarRent.Dao;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    private String brand;
    private String model;
    private String type;
    private String fuelType;
    private int seats;
    private String transmission;
    private double pricePerDay;
    private boolean availability;
    private String imageUrl;
    private double mileage;
    private int year;



}
