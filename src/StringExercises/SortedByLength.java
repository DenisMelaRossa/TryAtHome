package StringExercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class SortedByLength {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sortedByLength(n)));
    }

    public static String[] sortedByLength(int n) {
        Scanner scanner = new Scanner(System.in);
        String[] strList = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter line " + i + ": ");
            strList[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (strList[i].length() > strList[j].length()) {
                    String temp = strList[i];
                    strList[i] = strList[j];
                    strList[j] = temp;
                }
            }
        }
        return strList;
    }

}