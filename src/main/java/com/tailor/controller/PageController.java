package com.tailor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/customers-page")
    public String customersPage() {
        return "customers";
    }

    @GetMapping("/measurements-page")
    public String measurementsPage() {
        return "measurements";
    }
}
