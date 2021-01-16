package MatricesExercises;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 2, 8};
        for (int i = 0; i <=array.length / 2; i++) {

            int t = array[i];
            array[i] = array[array.length - i-1];
            array[array.length - i-1] = t;

        }


        System.out.println(Arrays.toString(array));
    }
}

