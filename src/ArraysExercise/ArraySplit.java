package ArraysExercise;

import java.util.Arrays;

public class ArraySplit {
    public static void main(String[] args) {
        int[] array = {1, 3, -2,0, -4,5,8,-1,0};

        int pos = 0;
        int neg = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pos++;
            } else if (array[i] < 0) {
                neg++;
            }
        }
        int[] poselement=new int[pos];
        int posfirst=0;
        int[] negelemement=new int[neg];
        int negfirst=0;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]>0){
                poselement[posfirst]=array[i];
                posfirst++;
            } else if(array[i]<0 ){
                negelemement[negfirst]=array[i];
                negfirst++;
            }

        }

        System.out.println(Arrays.toString(poselement));
        System.out.println(Arrays.toString(negelemement));

    }
}
