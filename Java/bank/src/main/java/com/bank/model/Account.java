package com.bank.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;

public abstract class Account {
    private String id;
    private Customer owner;
    private Money balance;
    private List<Transaction> transactions;

    public Account() {
        this.transactions = new ArrayList<>();
        this.balance = new ArrayList<>(0.0, "COP");
    }

    public Account(String id, Customer owner, Money balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }
// metdodos abstractos
    public abstract void applyInterest();

    public void deposit(Money amount){
        balance.setAmount(balance.getAmount() + amount.getAmount());
        transactions.add(new Transaction("DEP", amount, this.id));
    }

    
}
