package ArraysExercise;

import java.util.Arrays;

public class Array3times {
    public static void main(String[] args) {
        int[][][] array=new int[2][2][2];

        array[0][0][0]=3;
        array[0][1][0]=8;
        array[0][0][1]=9;
        array[0][1][1]=9;
        array[1][0][0]=9;
        array[1][1][0]=9;
        array[1][0][1]=9;
        array[1][1][1]=9;
        System.out.println(Arrays.toString(array));

    }
}
