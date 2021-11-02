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
        customers.put(id, new Customer(id,"Jasper", "Canine", "JJCdog@K9.com", "123_456_6785" ));

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

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer updateData) {
        Customer customer = customers.get(id);
        if (updateData.getFirstName() != null) {
            customer.setFirstName(customer.getFirstName());
        }
        if (updateData.getLastName() != null) {
            customer.setLastName(customer.getLastName());
        }
        if (updateData.getEmail() != null) {
            customer.setEmail(customer.getEmail());
        }
        if (updateData.getPhone() != null) {
            customer.setPhone(customer.getPhone());
        }
        return customer;
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customers.remove(id);
    }
}
