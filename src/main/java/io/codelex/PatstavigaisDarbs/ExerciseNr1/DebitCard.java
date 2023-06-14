package io.codelex.PatstavigaisDarbs.ExerciseNr1;

import java.math.BigDecimal;

class DebitCard extends Card {
    public DebitCard(String number, String owner, String ccv, BigDecimal balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) throws TooMuchMoneyException {
        BigDecimal currentBalance = getBalance();
        BigDecimal maxBalance = new BigDecimal("10000");

        if (currentBalance.add(amount).compareTo(maxBalance) > 0) {
            throw new TooMuchMoneyException("Warning: Too much money");
        }

        setBalance(currentBalance.add(amount));
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        BigDecimal currentBalance = getBalance();

        if (currentBalance.subtract(amount).compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Not enough funds");
        }

        setBalance(currentBalance.subtract(amount));
    }
}
