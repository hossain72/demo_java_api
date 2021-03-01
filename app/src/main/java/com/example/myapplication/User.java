package com.example.myapplication;

public class User {

    private String name;
    private String principalAmount;
    private String interestRate;
    private String tenureInMonth;

    public User(String name, String principalAmount, String interestRate, String tenureInMonth) {
        this.name = name;
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.tenureInMonth = tenureInMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getTenureInMonth() {
        return tenureInMonth;
    }

    public void setTenureInMonth(String tenureInMonth) {
        this.tenureInMonth = tenureInMonth;
    }
}
