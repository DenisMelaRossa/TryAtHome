package Practice;

import java.math.BigInteger;

public class Task8 {
    public static void main(String[] args) {

        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i < 64; i++) {
            BigInteger a =BigInteger.valueOf((long) Math.pow(2, i));
            System.out.println(a);
            sum = sum.add(a);
        }
        System.out.println();
        System.out.println(sum);
    }
}
