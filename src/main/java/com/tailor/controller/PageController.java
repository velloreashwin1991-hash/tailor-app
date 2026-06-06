package com.tailor.controller;

import com.tailor.model.Measurement;
import com.tailor.service.MeasurementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    private final MeasurementService service;

    public PageController(MeasurementService service) {
        this.service = service;
    }

    // 🏠 Home page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // 👤 Customers page
    @GetMapping("/customers-page")
    public String customersPage() {
        return "customers";
    }

    // 📏 Measurements page (GUI PAGE)
    @GetMapping("/measurements-page")
    public String measurementsPage() {
        return "measurements";
    }

    // 📏 Save measurement from FORM (GUI submit)
    @PostMapping("/measurements-page")
    public String addMeasurement(@ModelAttribute Measurement m) {
        service.save(m);
        return "redirect:/measurements-page";
    }
}
