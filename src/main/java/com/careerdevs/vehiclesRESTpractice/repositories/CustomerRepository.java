package com.careerdevs.vehiclesRESTpractice.repositories;

import com.careerdevs.vehiclesRESTpractice.vehicles.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Car, Long> {
}
