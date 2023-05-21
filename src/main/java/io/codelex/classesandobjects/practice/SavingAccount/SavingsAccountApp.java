package io.codelex.classesandobjects.practice.SavingAccount;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.print("How much money is in the account? ");
        double startingBalance = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("How long has the account been opened? ");
        int months = scanner.nextInt();

        SavingsAccount savingsAccount = new SavingsAccount(startingBalance);
        savingsAccount.setAnnualInterestRate(annualInterestRate);

        double totalDeposits = 0;
        double totalWithdrawals = 0;

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double depositAmount = scanner.nextDouble();
            savingsAccount.deposit(depositAmount);
            totalDeposits += depositAmount;

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdrawalAmount = scanner.nextDouble();
            savingsAccount.withdraw(withdrawalAmount);
            totalWithdrawals += withdrawalAmount;

            savingsAccount.addMonthlyInterest();
        }

        double interestEarned = savingsAccount.getBalance() - startingBalance - totalDeposits + totalWithdrawals;

        System.out.println("Total deposited: $" + decimalFormat.format(totalDeposits));
        System.out.println("Total withdrawn: $" + decimalFormat.format(totalWithdrawals));
        System.out.println("Interest earned: $" + decimalFormat.format(interestEarned));
        System.out.println("Ending balance: $" + decimalFormat.format(savingsAccount.getBalance()));

        scanner.close();
    }
}
