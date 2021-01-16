package Lesson4;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {-1, 3, 5, 2, -7};
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);

        }
        System.out.println(max+" "+ min);
    }
}
