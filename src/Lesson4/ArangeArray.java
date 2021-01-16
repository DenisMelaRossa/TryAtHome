package Lesson4;

public class ArangeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 6, 5, 8, 9};
        int[] array2 = {3, 2, 4,9,7,4,9};
        array1 = descending(array1);
        array2 = ascending(array2);
    }

    public static int[] descending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static int[] ascending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        return array;
    }
}

