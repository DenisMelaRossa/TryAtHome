package Lesson4;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(Arrays.toString(fibonacciFor(a)));
        System.out.println(Arrays.toString(fibonacciWhile(a)));
        System.out.println(Arrays.toString(fibonacciDoWhile(a)));
    }

    public static int[] fibonacciFor(int a) {
        int[] array = new int[a];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < a; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] fibonacciWhile(int a) {
        int[] array = new int[a];
        array[0] = 1;
        array[1] = 1;
        int index = 2;
        while (index < a) {
            array[index] = array[index - 1] + array[index - 2];
            index++;
        }
        return array;
    }

    public static int[] fibonacciDoWhile(int a) {
        int[] array = new int[a];
        array[0] = 1;
        array[1] = 1;
        int index = 2;
        do {
            array[index] = array[index - 1] + array[index - 2];
            index++;
        } while (index < a);
        return array;
    }
}
