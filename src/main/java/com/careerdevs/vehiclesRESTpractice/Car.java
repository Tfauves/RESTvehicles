package com.careerdevs.vehiclesRESTpractice;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Car extends Vehicle {

    public Car() {}

    public Car(Long id, String make, String model, Integer year, Long currentOdometer) {
        super(id,make, model, year, currentOdometer);

    }

}
