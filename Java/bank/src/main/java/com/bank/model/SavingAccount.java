package com.bank.model;

public class SavingAccount {
    private double interestRate;

    public SavingAccount(String id, Customer owner, Money balance, double interestRate) {
        super(id, owner, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void applyInterest() {
        double newBalance = getBalance().getAmount() + (getBalance().getAmount() * interestRate);
        getBalance().setAmount(newBalance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
