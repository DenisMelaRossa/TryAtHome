package Lesson4;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] array={1,2,4,3,5,8,2};
        for (int i = 0; i <array.length; i++) {

            if (array[i]%2==0){
                System.out.println(array[i]+",");
            }

        }
        System.out.println(Arrays.toString(array));
       if ( Arrays.equals(array,array)){
           System.out.println("Done");
       }


    }
}
