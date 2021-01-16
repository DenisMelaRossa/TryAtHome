package Lesson4;

import java.math.BigInteger;

public class Chess {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < 64; i++) {
            sum+=Math.pow(2,i);
        }

        System.out.println(sum);
    }
}
