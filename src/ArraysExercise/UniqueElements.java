package ArraysExercise;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 3,1,1,2};
        int length = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                length++;
            }
        }
        int[] unique = new int[length];
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }

            }
            if (count == 1) {
                unique[k] = array[i];
                k++;
            }

        }
        System.out.println(Arrays.toString(unique));


    }
}
