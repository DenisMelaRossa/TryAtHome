package StringExercises;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(charsandnumbers());
    }

    public static String charsandnumbers() {
        char[] str1 = new char[10];
        char oddelement = 'a';
        char evenelement = '1';


        for (int i = 0; i < str1.length; i++) {
            if (i % 2 == 0) {
                str1[i] = evenelement;
                evenelement++;
            } else {
                str1[i] = oddelement;
                oddelement++;
            }
        }
        String str2 = Arrays.toString(str1);

        return str2;
    }
}
