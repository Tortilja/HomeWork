package io.codelex.classesandobjects.practice.BankAccount;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.25);
        System.out.println(benben.toString());

        benben.deposit(10.50);
        System.out.println(benben.toString());

        benben.withdraw(15.00);
        System.out.println(benben.toString());

        benben.withdraw(20.00);
        System.out.println(benben.toString());
    }
}
