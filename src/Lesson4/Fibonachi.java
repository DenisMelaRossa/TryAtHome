package Lesson4;

import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");
        int[] fibonacci=new int[20];
        fibonacci[0]=1;
        fibonacci[1]=1;
        for (int i = 2; i < 20; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            fibonacci[i]=n3;
        }
        System.out.println();
        System.out.println(Arrays.toString(fibonacci));

        int[] array=new int[20];
        for (int i = 2; i <array.length ; i++) {
            array[0]=1;
            array[1]=1;
            array[i]=array[i-1]+array[i-2];
        }
        System.out.println(Arrays.toString(array));
    }
}
