package OOPS;

import java.math.BigDecimal;

public class DebitCard extends BankCard {


    public DebitCard(String holderName, BigDecimal balance) {
        super(holderName, balance);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (balance.compareTo(BigDecimal.valueOf(withdrawAmount)) == 1) {
            BigDecimal temp = balance.subtract(BigDecimal.valueOf(withdrawAmount));
            balance = temp;
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
