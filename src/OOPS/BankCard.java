package OOPS;

import java.math.BigDecimal;

public abstract class BankCard {
    protected String holderName;
    protected BigDecimal balance;


    public BankCard(String holderName) {
        this.holderName = holderName;
    }

    public BankCard(String holderName, BigDecimal balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println("Balance is: ".concat(String.valueOf(balance)));
    }

    public void deposit(double depositAmount) {
        if (depositAmount>0) {
            BigDecimal temp = balance.add(BigDecimal.valueOf(depositAmount));
            balance = temp;
        }
    }

    public abstract void withdraw(double withdrawAmount) throws WithdrawException;

    public BigDecimal convertToDollars() {
        BigDecimal rate = BigDecimal.valueOf(2.50);
        BigDecimal balance = getBalance();
        BigDecimal balanceInDollars = balance.divide(rate).setScale(2);
        return balanceInDollars;
    }

    public String toString() {
        return "BankCard{"
                + "Cartholder=" + holderName + '\''
                + ", balance=" + balance
                + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BankCard)) return false;
        BankCard that = (BankCard) object;
        if (!holderName.equals(this.holderName)) return false;
        if (balance.compareTo(that.balance) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        double balance1 = balance.doubleValue();
        temp = Double.doubleToLongBits(balance1);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + holderName.hashCode();
        return result;
    }
}
