package com.careerdevs.vehiclesRESTpractice.employees;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private Map<Long, Employee> employees = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong();

    public EmployeeController() {
        Long id = idCounter.incrementAndGet();
        employees.put(id, new Employee(id, "Rio", "sales"));
    }

    @GetMapping
    public List<Employee> all() {
        return new ArrayList<Employee>(employees.values());
    }

    @GetMapping("/{id}")
    public Employee employee (@PathVariable Long id) {
        return employees.get(id);
    }

    @PostMapping
    public Employee newEmployee (@RequestBody Employee newEmployee) {
        Long id = idCounter.incrementAndGet();
        newEmployee.set
    }
}
