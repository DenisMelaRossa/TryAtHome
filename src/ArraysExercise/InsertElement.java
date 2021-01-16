package ArraysExercise;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i = 0; i < array.length-1; i++) {
            array[i]=(int)(Math.random()*10)+5;
        }
        System.out.println(Arrays.toString(array));

        int newelement=5;
        int newindex=3;

        for (int i = array.length-2; i >=newindex ; i--) {
            array[i+1]=array[i];
        }
        array[newindex]=newelement;
        System.out.println(Arrays.toString(array));
    }
}
