package com.example.demo.customer;
import com.example.demo.equitydetails.EquityDetails;
import com.example.demo.liquiddetails.LiquidDetails;
import com.example.demo.loandetails.LoanDetails;
import com.example.demo.cryptodetails.CryptoDetails;
import com.example.demo.realestatedetails.RealEstateDetails;

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

    @OneToMany(cascade = CascadeType.ALL)
    private Set<RealEstateDetails> realEstate;

    private int goldInGrams;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<LiquidDetails> liquid;

    public Set<LoanDetails> getLoans() {
        return loans;
    }

    public void setLoans(Set<LoanDetails> loans) {
        this.loans = loans;
    }

    public Customer(Set<LoanDetails> loans, Set<RealEstateDetails> realEstate, CryptoDetails crypto, EquityDetails equity, int goldInGrams, Set<LiquidDetails> liquid){
        this.loans = loans;
        this.crypto = crypto;
        this.equity = equity;
        this.goldInGrams = goldInGrams;
        this.liquid = liquid;
        this.realEstate = realEstate;
    }

    public Customer(String name){
        this.name = name;
    }

    public CryptoDetails getCrypto() {
        return crypto;
    }

    public void setCrypto(CryptoDetails crypto) {
        this.crypto = crypto;
    }

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

    public Set<LiquidDetails> getLiquid() {
        return liquid;
    }

    public void setLiquid(Set<LiquidDetails> liquid) {
        this.liquid = liquid;
    }

    public Set<RealEstateDetails> getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(Set<RealEstateDetails> realEstate) {
        this.realEstate = realEstate;
    }
}
