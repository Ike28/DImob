package com.real.estate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String city;
    private String zone;
    private String address;
    private Long surfaceArea;

    public Property(Long id, String type, String city, String zone, String address, Long surfaceArea) {
        this.id = id;
        this.type = type;
        this.city = city;
        this.zone = zone;
        this.address = address;
        this.surfaceArea = surfaceArea;
    }

    public Property() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Long surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
}
