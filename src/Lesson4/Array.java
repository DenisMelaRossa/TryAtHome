package Lesson4;

public class Array {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i += 2) {
            array[i] = 2;
        }
        array[1]=-1;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i],2);
        }
        System.out.println(sum);
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (min>array[i]){
                min=array[i];
            }}

            System.out.println(min);
        for(int elements:array){
            min+=elements;
        }
        System.out.println(min);
        System.out.println(Double.MIN_VALUE);
    }
}
