package RecursionExamples;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {9, 2, 4, 6, 8, 10, 12, 14};
        Arrays.sort(input);
        int n = 12;
        int n1 = -1;
        int n2 = input.length;
        for (int i = -2; i < 16; i++) {
            System.out.println(i + " " + isFound(input, i, n1, n2));
        }
    }
    public static boolean isFound(int[] input, int n, int n1, int n2) {
        boolean result = false;
        if (n1 > n2 || n1 >= input.length || n2 < 0) {
            return false;
        }
        if (input[(n1 + n2) / 2] == n) {
            return true;
        } else if (input[(n1 + n2) / 2] < n) {
            n1 = (n1 + n2) / 2 + 1;
            return (isFound(input, n, n1, n2));
        } else {
            n2 = (n1 + n2) / 2 - 1;
            return (isFound(input, n, n1, n2));
        }
    }
}
