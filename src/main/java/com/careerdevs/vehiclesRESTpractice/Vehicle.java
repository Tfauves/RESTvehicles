package com.careerdevs.vehiclesRESTpractice;

//Create a new Car Rental project.
//        Create a Car Entity and controller
//        Create the following routes:
//        Read All Cars
//        Read One Car by Id
//        Create One Car
//
//
//        Bonus Challenges:
//        Create a Customer Entity and Controller
//        Create the same Customer Routes
//
//
//        Using your knowledge of Java Lists Attempt the following routes:
//        Update Car/Customer by Id - hint: you can use Post for this
//        Destroy Car/Customer by id - hint: the HTTP verb for this is Delete can you determine the @annotation?


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class Vehicle {
    private @Id @GeneratedValue Long id;
    private String make;
    private String model;
    private Integer year;
    private Long currentOdometer;

    public Vehicle() {}

    public Vehicle(Long id, String make, String model, Integer year, Long currentOdometer) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.currentOdometer = currentOdometer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getCurrentOdometer() {
        return currentOdometer;
    }

    public void setCurrentOdometer(Long currentOdometer) {
        this.currentOdometer = currentOdometer;
    }

}
