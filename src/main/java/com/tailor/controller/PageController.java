package com.tailor.controller;

import com.tailor.model.Customer;
import com.tailor.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    private final CustomerService service;

    public PageController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/customers-page")
    public String page() {
        return "customers";
    }

    @PostMapping("/customers-page")
    public String addCustomer(@ModelAttribute Customer c) {
        service.save(c);
        return "redirect:/customers-page";
    }
}
