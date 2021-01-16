package Lesson4.Vertex;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            array[j] = 2 * i + 2;
            j++;
        }
        System.out.println(Arrays.toString(array));

        int a = 0;
        int k = 1;
        while (k <= 99) {
            a++;
            k += 2;
        }
        System.out.println(a);

        int[] array2 = new int[a];

        for (int i = a-1, line=0; i >=0; i--) {

            array2[line] = 2 * i + 1;
            line++;
        }
        System.out.println(Arrays.toString(array2));
    }
}
