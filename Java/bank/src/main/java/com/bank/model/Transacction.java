package com.bank.model;

import java.util.Date;

public class Transacction {
    private String type;
    private Money amount;
    private String accountId;
    private localDateTime timestamp;

    public Transacction(localDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Transacction(String type, Money amount, String accountId) {
        this.type = type;
        this.amount = amount;
        this.accountId = accountId;
        this.timestamp = new localDateTime();
    }
}
