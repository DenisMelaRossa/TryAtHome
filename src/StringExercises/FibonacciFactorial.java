package StringExercises;

import java.util.Arrays;

public class FibonacciFactorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(algorithmFibonacciFactorial(2, 2, 5)));
    }

    public static int[] algorithmFibonacciFactorial(int algorithmtype, int looptype, int n) {
        if (algorithmtype == 1 && looptype == 1) return fibonacciWhile(n);
        if (algorithmtype == 1 && looptype == 2) return fibonacciDoWhile(n);
        if (algorithmtype == 1 && looptype == 3) return fibonacciFor(n);
        if (algorithmtype == 2 && looptype == 1) return factorialWhile(n);
        if (algorithmtype == 2 && looptype == 2) return factorialDoWhile(n);
        if (algorithmtype == 2 && looptype == 3) return factorialFor(n);
        else {
            int[] result = {-1};
            return result;
        }
    }

    public static int[] fibonacciWhile(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        int i = 2;
        while (i < n) {
            result[i] = result[i - 1] + result[i - 2];
            i++;
        }
        return result;
    }

    public static int[] fibonacciDoWhile(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        int i = 2;
        do {
            result[i] = result[i - 1] + result[i - 2];
            i++;
        } while (i < n);
        return result;
    }

    public static int[] fibonacciFor(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    public static int[] factorialWhile(int n) {
        int i = 1;
        int result = 1;
        while (i < n) {
            i++;
            result *= i;
        }
        int[] resultArray = {result};
        return resultArray;
    }

    public static int[] factorialDoWhile(int n) {
        int i = 1;
        int result = 1;
        do {
            i++;
            result *= i;
        } while (i < n);
        int[] resultArray = {result};
        return resultArray;
    }

    public static int[] factorialFor(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        int[] resultArray = {result};
        return resultArray;
    }
}
