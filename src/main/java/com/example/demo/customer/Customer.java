package com.example.demo.customer;

import javax.persistence.*;
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    private String loanProvider, cryptoCurrencyType, equityHolder;
    private double loanAmount, cryptoValue;
    private String name;
    private int shareInPercent, goldInGrams;
    private String bankName;
    private double liquidValue;

    public Customer(String name){
        this.name = name;
    }
    public Customer(long id, String loanProvider, String cryptoCurrencyType, String equityHolder, double loanAmount, double cryptoValue, String name, int shareInPercent, int goldInGrams, String bankName, double liquidValue, String realEstateLocation, double realEstateValue) {
        this.id = id;
        this.loanProvider = loanProvider;
        this.cryptoCurrencyType = cryptoCurrencyType;
        this.equityHolder = equityHolder;
        this.loanAmount = loanAmount;
        this.cryptoValue = cryptoValue;
        this.name = name;
        this.shareInPercent = shareInPercent;
        this.goldInGrams = goldInGrams;
        this.bankName = bankName;
        this.liquidValue = liquidValue;
        this.realEstateLocation = realEstateLocation;
        this.realEstateValue = realEstateValue;
    }

    private String realEstateLocation;
    private double realEstateValue;

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoanProvider() {
        return loanProvider;
    }

    public void setLoanProvider(String loanProvider) {
        this.loanProvider = loanProvider;
    }

    public String getCryptoCurrencyType() {
        return cryptoCurrencyType;
    }

    public void setCryptoCurrencyType(String cryptoCurrencyType) {
        this.cryptoCurrencyType = cryptoCurrencyType;
    }

    public String getEquityHolder() {
        return equityHolder;
    }

    public void setEquityHolder(String equityHolder) {
        this.equityHolder = equityHolder;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getCryptoValue() {
        return cryptoValue;
    }

    public void setCryptoValue(double cryptoValue) {
        this.cryptoValue = cryptoValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShareInPercent() {
        return shareInPercent;
    }

    public void setShareInPercent(int shareInPercent) {
        this.shareInPercent = shareInPercent;
    }

    public int getGoldInGrams() {
        return goldInGrams;
    }

    public void setGoldInGrams(int goldInGrams) {
        this.goldInGrams = goldInGrams;
    }

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

    public String getRealEstateLocation() {
        return realEstateLocation;
    }

    public void setRealEstateLocation(String realEstateLocation) {
        this.realEstateLocation = realEstateLocation;
    }

    public double getRealEstateValue() {
        return realEstateValue;
    }

    public void setRealEstateValue(double realEstateValue) {
        this.realEstateValue = realEstateValue;
    }
}
