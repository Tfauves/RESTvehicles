package com.careerdevs.vehiclesRESTpractice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Car extends Vehicle {
    private @Id @GeneratedValue long id;

    public Car() {}

    public Car(Long id, String make, String model, Integer year, Integer currentOdometer) {
        super(id,make, model, year, currentOdometer);

    }

}
