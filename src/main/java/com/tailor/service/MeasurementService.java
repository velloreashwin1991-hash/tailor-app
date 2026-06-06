package com.tailor.service;

import com.tailor.model.Measurement;
import java.util.List;

public interface MeasurementService {
    Measurement save(Measurement m);
    List<Measurement> getAll();
}
