package Lesson4.Vertex;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = (int) (Math.random() * 8) + 1;
            array2[i] = (int) (Math.random() * 8) + 1;
            array3[i] = (double) array1[i] / array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        int b = 0;
        for (int i = 0; i < 10; i++) {
            if (array3[i] - (int) array3[i] == 0) {
                b++;
            }
        }
        System.out.println(b);
    }
}
