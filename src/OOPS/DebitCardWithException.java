package OOPS;

import java.math.BigDecimal;

public class DebitCardWithException extends BankCard {


    public DebitCardWithException(String holderName, BigDecimal balance) {
        super(holderName, balance);
    }

    @Override
    public void withdraw(double withdrawAmount) throws WithdrawException {
        if (balance.compareTo(BigDecimal.valueOf(withdrawAmount)) == 1) {
            BigDecimal temp = balance.subtract(BigDecimal.valueOf(withdrawAmount));
            balance = temp;
        } else{
            throw new WithdrawException();
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
