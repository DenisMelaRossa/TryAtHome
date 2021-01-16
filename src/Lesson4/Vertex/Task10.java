package Lesson4.Vertex;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 3) - 1;
        }
        System.out.println(Arrays.toString(array));

        int max=0;
        int element=0;
        for (int i = 0; i < 10; i++) {
            int b = 0;

            for (int j = 0; j < 10; j++) {
                if (array[i] == array[j]) {
                    b++;
                }
            }
            if (b>max){
                max=b;
                element=array[i];
            }

        }
        System.out.println(max+" "+element);
    }
}
