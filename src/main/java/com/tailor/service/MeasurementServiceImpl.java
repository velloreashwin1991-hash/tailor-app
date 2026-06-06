package com.tailor.service;

import com.tailor.model.Measurement;
import com.tailor.repository.MeasurementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasurementServiceImpl implements MeasurementService {

    private final MeasurementRepository repo;

    public MeasurementServiceImpl(MeasurementRepository repo) {
        this.repo = repo;
    }

    @Override
    public Measurement save(Measurement m) {
        return repo.save(m);
    }

    @Override
    public List<Measurement> getAll() {
        return repo.findAll();
    }
}
