package com.example.demo.loandetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LoanDetails {

    @Id
    @GeneratedValue
    private long id;
    private String loanProvider;
    private double loanAmount;

    public String getLoanProvider() {
        return loanProvider;
    }

    public LoanDetails() {
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLoanProvider(String loanProvider) {
        this.loanProvider = loanProvider;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LoanDetails(String loanProvider, double loanAmount) {
        this.loanProvider = loanProvider;
        this.loanAmount = loanAmount;
    }
}
