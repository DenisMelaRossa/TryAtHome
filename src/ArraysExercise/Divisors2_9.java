package ArraysExercise;

import java.util.Arrays;

public class Divisors2_9 {
    public static void main(String[] args) {
        int[] array=new int[8];
        int k=0;

        for (int i = 2; i <=9; i++) {
            int divisor=0;
            for (int j = 2; j <= 99; j++) {
                if(j%i==0){
                    divisor++;
                }

            }
            array[k]=divisor;
            k++;
        }

        System.out.println(Arrays.toString(array));
    }
}
