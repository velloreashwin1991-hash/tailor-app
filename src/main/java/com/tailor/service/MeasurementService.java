package com.tailor.service;

import com.tailor.model.Measurement;
import com.tailor.repository.MeasurementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasurementService {

    private final MeasurementRepository repo;

    public MeasurementService(MeasurementRepository repo) {
        this.repo = repo;
    }

    public Measurement add(Measurement m) {
        return repo.save(m);
    }

    public List<Measurement> getAll() {
        return repo.findAll();
    }
}
