package com.tailor.model;

import jakarta.persistence.*;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double chest;
    private Double waist;
    private Double sleeve;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getChest() { return chest; }
    public void setChest(Double chest) { this.chest = chest; }

    public Double getWaist() { return waist; }
    public void setWaist(Double waist) { this.waist = waist; }

    public Double getSleeve() { return sleeve; }
    public void setSleeve(Double sleeve) { this.sleeve = sleeve; }
}
