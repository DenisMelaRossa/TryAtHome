package OOPS;

import java.util.Objects;

public class ATM {
    private BankCard card;

    public ATM(BankCard card) {
        this.card = card;
    }

    public ATM() {

    }

    public void withdraw(double withdrawAmount) throws WithdrawException {
        card.withdraw(withdrawAmount);
    }

    public void deposit(double depositAmount) {
        card.deposit(depositAmount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return card.equals(atm.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card);
    }

    @Override
    public String  toString() {
        return "ATM{" +
                "card=" + card +
                '}';
    }
}
