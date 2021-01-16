package MatricesExercises;

import java.util.Arrays;

public class MatrixSort {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }

        int[] arraytoline = new int[array.length * array[0].length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arraytoline[k] = array[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(arraytoline));
        Arrays.sort(arraytoline);
        System.out.println();
        System.out.println(Arrays.toString(arraytoline));

        int m = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = arraytoline[m];
                m++;
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
