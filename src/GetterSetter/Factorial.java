package GetterSetter;

public class Factorial {

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
        int i = 0;
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
