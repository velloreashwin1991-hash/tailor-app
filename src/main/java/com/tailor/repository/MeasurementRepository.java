package com.tailor.repository;

import com.tailor.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
