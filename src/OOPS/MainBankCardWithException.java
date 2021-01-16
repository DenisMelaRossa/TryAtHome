package OOPS;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class MainBankCardWithException {
    public static void main(String[] args) throws WithdrawException {
        BankCard owner1 = new DebitCardWithException("Ivanov", BigDecimal.valueOf(30));
        try {
            owner1.withdraw(40.00);
        } catch (WithdrawException e) {
            System.out.println(e + " problem");
        }

        System.out.println(owner1.getBalance());
    }
}
