package ArraysExercise;

import java.util.Arrays;

public class IndeceswithEvenNumbers {
    public static void main(String[] args) {
        int[] array={1,3,4,6,7,8};
         int count=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                count++;
            }

        }

        int[] indices= new int[count];
        int j=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                indices[j]=i;
                j++;
            }

        }
        System.out.println(Arrays.toString(indices));
    }
}
