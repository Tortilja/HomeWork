package io.codelex.classesandobjects.practice.SavingAccount;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public SavingsAccount(double startingBalance) {
        balance = startingBalance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void addMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public double getBalance() {
        return balance;
    }
    public void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }
}
