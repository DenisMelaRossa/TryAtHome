package Lesson4.Vertex;

public class ArrayDigitsSum {
    public static void main(String[] args) {
        int[] array={12,104,81,104,45};
        int sum=0;
        int number=123;

        for (int i = 0; i < array.length; i++) {


            while (array[i] > 0) {
                sum += array[i] % 10;
                array[i] /= 10;
            }
        }
        System.out.println(sum);
    }
}

