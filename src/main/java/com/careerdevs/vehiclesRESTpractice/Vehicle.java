package com.careerdevs.vehiclesRESTpractice;

public abstract class Vehicle {
    private Long id;
    private String make;
    private String model;
    private Integer year;
    private Integer currentOdometer;

    public Vehicle() {}

    public Vehicle(Long id, String make, String model, Integer year, Integer currentOdometer) {
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

    public Integer getCurrentOdometer() {
        return currentOdometer;
    }

    public void setCurrentOdometer(Integer currentOdometer) {
        this.currentOdometer = currentOdometer;
    }

}
