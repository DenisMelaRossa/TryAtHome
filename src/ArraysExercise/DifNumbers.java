package ArraysExercise;

import java.util.Arrays;

public class DifNumbers {
    public static void main(String[] args) {
        int[] array = new int[10];

        int count=0;
        do {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
                for (int j = 0; j <=i; j++) {
                    if (array[i] == array[j]) {
                        count++;

                    }
                }
                if (i==array.length-1 && count!=array.length){
                    count=0;
                }
            }
        } while (count!=array.length);


        System.out.println(Arrays.toString(array));
    }

}

