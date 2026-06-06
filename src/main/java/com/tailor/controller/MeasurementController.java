package com.tailor.controller;

import com.tailor.model.Measurement;
import com.tailor.service.MeasurementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/measurements")
public class MeasurementController {

    private final MeasurementService service;

    public MeasurementController(MeasurementService service) {
        this.service = service;
    }

    // ✅ JSON API (Postman)
    @PostMapping
    public Measurement add(@RequestBody Measurement m) {
        return service.save(m);
    }

    @GetMapping
    public List<Measurement> getAll() {
        return service.getAll();
    }
}
