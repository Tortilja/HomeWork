package io.codelex.classesandobjects.practice.BankAccount;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public String toString() {
        String balanceString;
        if (balance >= 0) {
            balanceString = String.format("$%.2f", balance);
        } else {
            balanceString = String.format("-$%.2f", Math.abs(balance));
        }
        return name + ", " + balanceString;
    }
}



