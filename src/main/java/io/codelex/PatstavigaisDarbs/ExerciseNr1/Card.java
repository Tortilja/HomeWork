package io.codelex.PatstavigaisDarbs.ExerciseNr1;

import java.math.BigDecimal;

abstract class Card {
    private String number;
    private String owner;
    private String ccv;
    private BigDecimal balance;

    public Card(String number, String owner, String ccv, BigDecimal balance) {
        this.number = number;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public String getCcv() {
        return ccv;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public abstract void addMoney(BigDecimal amount) throws TooMuchMoneyException;

    public abstract void takeMoney(BigDecimal amount) throws NotEnoughFundsException;
}