package com.example.demo.liquiddetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class LiquidDetails {
    @Id
    @GeneratedValue
    private long id;
    private String bankName;
    private double liquidValue;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getLiquidValue() {
        return liquidValue;
    }

    public void setLiquidValue(double liquidValue) {
        this.liquidValue = liquidValue;
    }

    public LiquidDetails() {
    }

    public LiquidDetails(String bankName, double liquidValue) {
        this.bankName = bankName;
        this.liquidValue = liquidValue;
    }
}
