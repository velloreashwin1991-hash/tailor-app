package com.tailor.controller;

import com.tailor.model.Customer;
import com.tailor.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public Customer add(@RequestBody Customer c) {
        return service.add(c);
    }

    @GetMapping
    public List<Customer> getAll() {
        return service.getAll();
    }
}
