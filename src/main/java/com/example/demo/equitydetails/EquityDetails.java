package com.example.demo.equitydetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EquityDetails {
    @Id
    @GeneratedValue
    private long id;
    private String equityHolder;
    private int shareInPercent;

    public EquityDetails() {
    }

    public EquityDetails(String equityHolder, int shareInPercent) {
        this.equityHolder = equityHolder;
        this.shareInPercent = shareInPercent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEquityHolder() {
        return equityHolder;
    }

    public void setEquityHolder(String equityHolder) {
        this.equityHolder = equityHolder;
    }

    public int getShareInPercent() {
        return shareInPercent;
    }

    public void setShareInPercent(int shareInPercent) {
        this.shareInPercent = shareInPercent;
    }
}
