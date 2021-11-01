package com.careerdevs.vehiclesRESTpractice;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

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



@RestController
@RequestMapping("/cars")
public class CarController {
    private Map<Long, Car> cars = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong();


    public CarController() {
        Long id = idCounter.incrementAndGet();
        cars.put(id, new Car(id, "ford", "focus", 2012, 88000));
    }

    @GetMapping
    public List<Car> all() {
        return new ArrayList<Car>(cars.values());
    }

    @GetMapping("/{id}")
    public Car car(@PathVariable Long id) {
        return cars.get(id);
    }

    @PostMapping
    public Car newCar(@RequestBody Car newCar) {
        Long id = idCounter.incrementAndGet();
        newCar.setId(id);
        cars.put(id, newCar);
        return newCar;
    }



}
