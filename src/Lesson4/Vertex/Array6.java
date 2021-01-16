package Lesson4.Vertex;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] array={1,2,4,6,8,9};
        for (int i = 0; i <array.length ; i++) {
            if(i%2==1){
                array[i]=0;
            }

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");

        }

        int[] array2=new int[8];
        for (int i = 0; i <array2.length ; i++) {
            array2[i]=(int)(Math.random()*10)+3;
        }
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i <array2.length ; i++) {
            if (array2[i]%2==1){
                array2[i]=0;
            }
                    }
        System.out.println(Arrays.toString(array2));
    }
}
