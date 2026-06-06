package com.tailor.controller;

import com.tailor.model.Customer;
import com.tailor.model.Measurement;
import com.tailor.service.CustomerService;
import com.tailor.service.MeasurementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    private final CustomerService customerService;
    private final MeasurementService measurementService;

    public PageController(CustomerService customerService,
                          MeasurementService measurementService) {
        this.customerService = customerService;
        this.measurementService = measurementService;
    }

    // HOME PAGE
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // CUSTOMER PAGE
    @GetMapping("/customers")
    public String customerPage(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customers", customerService.getAll());
        return "customers";
    }

    @PostMapping("/customers/save")
    public String saveCustomer(@ModelAttribute Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }

    // MEASUREMENT PAGE
    @GetMapping("/measurements")
    public String measurementPage(Model model) {
        model.addAttribute("measurement", new Measurement());
        model.addAttribute("measurements", measurementService.getAll());
        return "measurements";
    }

    @PostMapping("/measurements/save")
    public String saveMeasurement(@ModelAttribute Measurement m) {
        measurementService.save(m);
        return "redirect:/measurements";
    }
}
