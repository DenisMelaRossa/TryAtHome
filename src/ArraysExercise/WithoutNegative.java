package ArraysExercise;

import java.util.Arrays;

public class WithoutNegative {
    public static void main(String[] args) {
        int[] array={1,2,-5,-6,6,-7};

        int count=0;
        for (int i = 0; i < array.length; i++) {
           if(array[i]>0){
               count++;
           }

        }

        int[] arraywithoutnegative=new int[count];
        int ind=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){
                arraywithoutnegative[ind]=array[i];
                ind++;
            }

        }

        System.out.println(Arrays.toString(arraywithoutnegative));

    }

}
