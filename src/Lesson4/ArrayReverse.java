package Lesson4;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {


        int[] array = {1, 2, 4, 5, 8};

        int k = array.length;
        int[] array2=new int[k];
        for (int i = 0; i < k/2; i++) {
           array2[i]=array[i];
           array[i] = array[k - i - 1];
           array[k-i-1]=array2[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
