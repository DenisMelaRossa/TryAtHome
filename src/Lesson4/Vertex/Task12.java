package Lesson4.Vertex;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int[] array = new int[12];
        do {

            for (int i = 0; i < 12; i++) {
                array[i] = (int) (Math.random() * 21) - 10;
                if (array[i] > 0) {
                    a++;
                } else {
                    b++;
                }
                if (i ==11 && a != 6) {
                    a = 0;
                    b = 0;
                }
            }


        } while (a != 6 && b != 6);
        System.out.println(Arrays.toString(array));
    }
}
