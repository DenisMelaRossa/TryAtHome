package StringExercises;

import java.util.Arrays;

public class UniqueChar {
    public static void main(String[] args) {
        String[] input = new String[2];
        input[0] = "wordhorde2kl";
        input[1] = "wor2ke";

        String result = "";

        char[] str1 = input[0].toCharArray();
        char[] str2 = input[1].toCharArray();

        for (int i = 0; i < input[0].length(); i++) {
            int count = 0;
            for (int j = i + 1; j < input[0].length(); j++) {
                if (str1[i] == str1[j]) {
                    str1[j] = ' ';
                    count++;
                }
            }
            if (count != 0) {
                str1[i] = ' ';
            }
        }
        System.out.println(Arrays.toString(str1));
        for (int i = 0; i < str1.length; i++) {
            int count = 0;
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    count++;
                }
            }
            if (count != 1) {
                str1[i] = ' ';
            }
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != ' ') {
                result = result.concat(Character.toString(str1[i]));
            }
        }
        System.out.println(result);
    }
}
