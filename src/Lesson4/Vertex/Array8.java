package Lesson4.Vertex;

public class Array8 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 6};
        int[] array2 = {2, 4, 5, 7, 1, 9};
        int k1=average(array1);
        int k2=average(array2);
        if (k1==k2){
            System.out.println("equals");
        } else if (k1>k2){
            System.out.println("k1 is bigger");
        }else{
            System.out.println("k2 is bigger");
        }
    }

    public static int average(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        int average = sum / input.length;
        return average;
    }

}

