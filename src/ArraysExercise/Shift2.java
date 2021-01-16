package ArraysExercise;

public class Shift2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 2, 1};
        int a = -4;
        int[][] shiftedarray = shift(array, a);
        for (int i = 0; i < shiftedarray.length; i++) {
            for (int j = 0; j < shiftedarray[i].length; j++) {
                System.out.print(shiftedarray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] shift(int[] array, int a) {
        int[][] result = new int[Math.abs(a)][array.length];
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = 0;
                for (int k = 0; k < array.length; k++) {
                    result[i][k] = array[k];
                }
            }
        } else {
            for (int i = 0; i < -a; i++) {
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = 0;
                for (int k = 0; k < array.length; k++) {
                    result[i][k] = array[k];
                }
            }
        }
        return result;
    }
}

