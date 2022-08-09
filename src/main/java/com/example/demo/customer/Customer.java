package com.example.demo.customer;
import com.example.demo.equitydetails.EquityDetails;
import com.example.demo.loandetails.LoanDetails;
import com.example.demo.cryptodetails.CryptoDetails;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<LoanDetails> loans;

    @OneToOne(cascade = CascadeType.ALL)
    private CryptoDetails crypto;

    @OneToOne(cascade = CascadeType.ALL)
    private EquityDetails equity;

    private int goldInGrams;
    private String bankName;
    private double liquidValue;

    public Set<LoanDetails> getLoans() {
        return loans;
    }

    public void setLoans(Set<LoanDetails> loans) {
        this.loans = loans;
    }

    public Customer(Set<LoanDetails> loans, CryptoDetails crypto, EquityDetails equity, int goldInGrams, String bankName, double liquidValue, String realEstateLocation, double realEstateValue) {
        this.loans = loans;
        this.crypto = crypto;
        this.equity = equity;
        this.goldInGrams = goldInGrams;
        this.bankName = bankName;
        this.liquidValue = liquidValue;
        this.realEstateLocation = realEstateLocation;
        this.realEstateValue = realEstateValue;
    }

    public Customer(String name){
        this.name = name;
    }

    /*public Customer(long id, LoanDetails loans, CryptoDetails crypto, EquityDetails equity, int goldInGrams, String bankName, double liquidValue, String realEstateLocation, double realEstateValue) {
        this.id = id;
        this.loans = loans;
        this.crypto = crypto;
        this.equity = equity;
        this.goldInGrams = goldInGrams;
        this.bankName = bankName;
        this.liquidValue = liquidValue;
        this.realEstateLocation = realEstateLocation;
        this.realEstateValue = realEstateValue;
    }*/

    public CryptoDetails getCrypto() {
        return crypto;
    }

    public void setCrypto(CryptoDetails crypto) {
        this.crypto = crypto;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquityDetails getEquity() {
        return equity;
    }

    public void setEquity(EquityDetails equity) {
        this.equity = equity;
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
