package com.example.demo.cryptodetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CryptoDetails {
    @Id
    @GeneratedValue
    private long id;
    private String cryptoCurrencyType;
    private double cryptoValue;

    public CryptoDetails(String cryptoCurrencyType, double cryptoValue) {
        this.cryptoCurrencyType = cryptoCurrencyType;
        this.cryptoValue = cryptoValue;
    }

    public CryptoDetails() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCryptoCurrencyType() {
        return cryptoCurrencyType;
    }

    public void setCryptoCurrencyType(String cryptoCurrencyType) {
        this.cryptoCurrencyType = cryptoCurrencyType;
    }

    public double getCryptoValue() {
        return cryptoValue;
    }

    public void setCryptoValue(double cryptoValue) {
        this.cryptoValue = cryptoValue;
    }
}
