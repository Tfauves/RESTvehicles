package com.careerdevs.vehiclesRESTpractice.vehicles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Car extends Vehicle {
    private @Id @GeneratedValue Long id;

    public Car() {}

    public Car(Long id, String make, String model, Integer year, Integer currentOdometer) {
        super(id, make, model, year, currentOdometer);

    }



}
