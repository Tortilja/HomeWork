package io.codelex.classesandobjects.practice.Account;

public class AccountApp {
    public static void main(String[] args) {
        // Your first account
        Account bartosAccount = new Account("Barto's account", 100.0);
        bartosAccount.deposit(20.0);
        System.out.println(bartosAccount);

        // Your first money transfer
        Account mattAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);

        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(mattAccount);
        System.out.println(myAccount);

        // Money transfers
        Account accountA = new Account("A", 100.0);
        Account accountB = new Account("B", 0.0);
        Account accountC = new Account("C", 0.0);

        transfer(accountA, accountB, 50.0);
        transfer(accountB, accountC, 25.0);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
