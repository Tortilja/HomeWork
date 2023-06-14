package io.codelex.PatstavigaisDarbs.ExerciseNr1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234567890", "John Doe", "123", BigDecimal.valueOf(99));
        DebitCard debitCard = new DebitCard("0987654321", "Jane Smith", "456", BigDecimal.valueOf(8000));

        try {
            creditCard.takeMoney(BigDecimal.valueOf(10));
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            debitCard.takeMoney(BigDecimal.valueOf(10000));
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            debitCard.addMoney(BigDecimal.valueOf(200));
        } catch (TooMuchMoneyException e) {
            System.out.println(e.getMessage());
        }

        try {
            debitCard.addMoney(BigDecimal.valueOf(3000));
        } catch (TooMuchMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
