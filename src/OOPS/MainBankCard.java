package OOPS;

import java.math.BigDecimal;

public class MainBankCard {
    public static void main(String[] args) throws WithdrawException {
        BankCard owner1=new DebitCard("Ivanov", BigDecimal.valueOf(3210));
        BankCard owner2=new DebitCard("Petrov", BigDecimal.valueOf(4200));
        System.out.println(owner1.toString());
        System.out.println(owner1.equals(owner2));
        System.out.println(owner1.equals(owner1));
        owner1.withdraw(100.00);
        System.out.println(owner1.getBalance());
        owner1.deposit(120);
        System.out.println(owner1.getBalance());
        owner2.printBalance();
        System.out.println(owner1.convertToDollars());

        DebitCard debit1=new DebitCard("Petrov", BigDecimal.valueOf(200));
        System.out.println(debit1.toString());
    }
}
