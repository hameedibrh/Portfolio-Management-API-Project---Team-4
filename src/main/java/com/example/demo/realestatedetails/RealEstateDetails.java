package com.example.demo.realestatedetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RealEstateDetails {
    @Id
    @GeneratedValue
    private long id;
    private String propertyName;
    private double propertyValue;

    public RealEstateDetails() {
    }

    public RealEstateDetails(String propertyName, double propertyValue) {
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }
}
