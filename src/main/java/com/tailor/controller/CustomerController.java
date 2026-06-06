package com.tailor.controller;

import com.tailor.model.Customer;
import com.tailor.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    // ✅ JSON API (Postman)
    @PostMapping
    public Customer add(@RequestBody Customer c) {
        return service.save(c);
    }

    @GetMapping
    public List<Customer> getAll() {
        return service.getAll();
    }
}
