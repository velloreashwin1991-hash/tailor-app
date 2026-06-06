package com.tailor.controller;

import com.tailor.model.Measurement;
import com.tailor.service.MeasurementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {

    private final MeasurementService service;

    public MeasurementController(MeasurementService service) {
        this.service = service;
    }

    @PostMapping
    public Measurement add(@RequestBody Measurement m) {
        return service.add(m);
    }

    @GetMapping
    public List<Measurement> getAll() {
        return service.getAll();
    }
}
