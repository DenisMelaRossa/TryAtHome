package StringExercises;

import java.util.Arrays;
import java.util.Scanner;

public class LongestandShortestString {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(LongestAndShortest(n)));
    }

    public static String[] LongestAndShortest(int n) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String[] strArray = new String[n];
        while (i <n) {
            System.out.println("Enter line " + i + " :");
            strArray[i] = scanner.nextLine();
            i++;
        }

        int maxlength = strArray[0].length();
        int minlength = strArray[0].length();
        int maxindex = 0;
        int minindex = 0;

        for (int j = 0; j < strArray.length; j++) {
            if (strArray[j].length() > maxlength) {
                maxlength = strArray[j].length();
                maxindex = j;
            }
            if (strArray[j].length() < minlength) {
                minlength = strArray[j].length();
                minindex = j;
            }
        }

        String[] result = new String[4];
        result[0] = strArray[maxindex];
        result[1] = String.valueOf(maxlength);
        result[2] = strArray[minindex];
        result[3] = String.valueOf(minlength);

        return result;
    }
}
