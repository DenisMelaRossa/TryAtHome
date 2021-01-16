package ArraysExercise;

import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {

        int[] array = {1, 23, 4, 6,7,9,4};
        int a = -4;
        if (a>0) {
            for (int j = 0; j < a; j++) {
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[0] = 0;
                System.out.println(Arrays.toString(array));
            }
        }else{
            for(int k=0; k<-a;k++){
                for(int m=0;m<array.length-1;m++){
                    array[m]=array[m+1];
                }
                array[array.length-1]=0;
                System.out.println(Arrays.toString(array));
            }
        }

    }
}

