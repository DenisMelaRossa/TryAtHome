package Lesson4.Vertex;

import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,5,6,3,4,8,9,10};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count += 1;
            }
        }
        int[] array2 = new int[count];
        int index=0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] % 2 == 0) {
                    array2[index] = array[j];
                    index++;
                }
        }
        System.out.println(Arrays.toString(array2));
    }
}
