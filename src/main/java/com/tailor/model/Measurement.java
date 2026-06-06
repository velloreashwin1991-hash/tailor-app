package com.tailor.model;

import jakarta.persistence.*;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private double shirtLength;
    private double sleeveLength;
    private double waist;
    private double pantLength;

    public Measurement() {}

    public Long getId() { return id; }

    public Long getCustomerId() { return customerId; }
    public double getShirtLength() { return shirtLength; }
    public double getSleeveLength() { return sleeveLength; }
    public double getWaist() { return waist; }
    public double getPantLength() { return pantLength; }

    public void setId(Long id) { this.id = id; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }
    public void setShirtLength(double shirtLength) { this.shirtLength = shirtLength; }
    public void setSleeveLength(double sleeveLength) { this.sleeveLength = sleeveLength; }
    public void setWaist(double waist) { this.waist = waist; }
    public void setPantLength(double pantLength) { this.pantLength = pantLength; }
}
