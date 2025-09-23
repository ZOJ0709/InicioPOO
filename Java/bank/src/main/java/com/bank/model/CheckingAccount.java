package com.bank.model;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(){

    }

    public CheckingAccount(String id, Customer owner, Money balance, double interestRate) {
        super(String id, Customer owner, Money balance, double interestRate);
    }

    @Override
    public void applyInterest(){}

    public Boolean withdraw(Money amount) {
        double available = getBalance().getAmount() + overdraftLimit;
        if ( available >= amount.getAmount()) {
            getBalance().setAmount(getBalance().getAmount() - amount.getAmount());
            getTransactions().add(new Transaction("WRD", amount, getId()));
            return true;
        } return false;
    }

    public double getOverdraftLimit(){ return overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit) { this.overdraftLimit = overdraftLimit;}

}
