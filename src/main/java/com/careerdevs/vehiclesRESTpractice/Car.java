package com.careerdevs.vehiclesRESTpractice;

import javax.persistence.Entity;


@Entity
public class Car extends Vehicle {

    public Car() {}

    public Car(Long id, String make, String model, Integer year, Integer currentOdometer) {
        super(id,make, model, year, currentOdometer);

    }

}
