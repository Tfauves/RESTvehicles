package com.careerdevs.vehiclesRESTpractice.customers;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    Map<Long, Customer> customers = new HashMap<>();
    AtomicLong idCounter = new AtomicLong();

    public CustomerController() {
        Long id = idCounter.incrementAndGet();
        customers.put(id, new Customer(id, "Jasper", "Canine", "JJCdog@K9.com", "123_456_6785" ));

    }
    @GetMapping
    public List<Customer> allCustomers() {
        return new ArrayList<Customer>(customers.values());
    }

    @GetMapping("/{id}")
    public Customer customer(@PathVariable Long id) {
        return customers.get(id);
    }

    @PostMapping
    public Customer newCustomer(@RequestBody Customer newCustomer) {
        Long id = idCounter.incrementAndGet();
        newCustomer.setId(id);
        customers.put(id,newCustomer);
        return newCustomer;
    }
}
