package OOPS;

import java.math.BigDecimal;

public class CreditCard extends BankCard {


    public CreditCard(String holderName, BigDecimal balance) {
        super(holderName, balance);
    }

    @Override
    public void withdraw(double withdrawAmount) {
            BigDecimal temp = balance.subtract(BigDecimal.valueOf(withdrawAmount));
            balance = temp;
    }


    @Override
    public String toString() {
        return "CreditCard{" +
                "holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
