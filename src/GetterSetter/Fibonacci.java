package GetterSetter;

public class Fibonacci {

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
        if (n != 2) {
            int i = 2;
            do {
                result[i] = result[i - 1] + result[i - 2];
                i++;
            } while (i < n);
        }
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
}
