package Practice;

import java.math.BigInteger;

public class Task8_2 {
    public static void main(String[] args) {

        BigInteger sum = BigInteger.valueOf(0);
        BigInteger power=BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);
        int i = 1;
        while (i <= 64) {
            BigInteger bigi = BigInteger.valueOf(i);
            System.out.println(power);
            sum = sum.add(power);
            power = power.multiply(two);
            i++;
        }
        System.out.println();
        System.out.println(sum);
    }
}
