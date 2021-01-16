package StringExercises;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "sRepeat 3 timesss";
        String str2="test";
        System.out.println(Arrays.toString(repeat(str1)));
        System.out.println(Arrays.toString(elements(str1)));
        System.out.println(Arrays.toString(lastcharindices(str1)));
        System.out.println(Arrays.toString(element369(str2)));
        System.out.println(Arrays.toString(firstandlast3chars(str1)));
        System.out.println(Arrays.toString(firstandlast3chars(str2)));
        System.out.println(xw(str1));
    }

    public static String[] repeat(String input) {
        String[] result = new String[2];
        result[0] = input + ", " + input + ", " + input;
        result[1] = String.valueOf(result[0].length());
        return result;
    }

    public static char[] elements(String str1) {
        char[] result = new char[3];
        result[0] = str1.charAt(0);
        if (str1.length() % 2 != 0) {
            result[1] = str1.charAt(str1.length() / 2);
        } else {
            result[1] = ' ';
        }
        result[2] = str1.charAt(str1.length() - 1);
        return result;

    }

    public static int[] lastcharindices(String str1) {
        char last = str1.charAt(str1.length() - 1);
        char[] array = str1.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == last) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == last) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    static public char[] element369(String str1) {
        char[] array = str1.toCharArray();
        char[] result = new char[array.length / 3];
        int index = 0;
        for (int i = 3; i < array.length; i += 3) {
            result[index] = array[i];
            index++;
        }
        return result;
    }

    static public String[] firstandlast3chars(String str1) {
        String[] result1 = new String[2];
        String[] result2 = new String[1];
        result2[0]="";
        if (str1.length() > 5) {
            result1[0] = str1.substring(0, 3);
            result1[1] = str1.substring(str1.length() - 3, str1.length());
            return result1;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                result2[0] =result2[0]+ str1.substring(0, 1);

            }
            return result2;
        }

    }
    public static char xw(String str1){
        char[] array=str1.toCharArray();
        int countx=0;
        int countw=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]=='x') {
                countx++;
            }
            if (array[i]=='w'){
                countw++;
            }
        }
        if (countx==0){
            System.out.println("No x in the text");
        }
        if (countw==0){
            System.out.println("No w in the text");
        }
        char result=' ';
        if (countx>countw){
            result='x';
        } else if (countw>countx){
            result='w';
        }
        return result;
    }



}


