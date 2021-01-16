package StringExercises;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringByAlphabeticOrder2 {
    public static void main(String[] args) {
        String input = "text here, oh a a oh jo jo try To split, and order them To to to";
        groupWordsByAlphabet(input);
    }

    public static void groupWordsByAlphabet(String input) {
        String[] inputArray = convertTextToSortedArray(input);

        for (char index = 'a'; index <= 'z'; index++) {

            int count = 0;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i].charAt(0) == index) {
                    count++;
                }
            }
            if (count > 0) {
                String charToString = String.valueOf(index);
                System.out.print(charToString.toUpperCase() + ":");
            }

            for (int i = 0; i < inputArray.length; i++) {
                if (i == 0 && inputArray[0].charAt(0) == index) {
                    System.out.println("\t" + inputArray[0] + " " + countWords(inputArray)[0]);
                } else if (inputArray[i].charAt(0) == index && !inputArray[i].equals(inputArray[i - 1])) {
                    System.out.println("\t" + inputArray[i] + " " + countWords(inputArray)[i]);
                }
            }
        }
    }


    public static int[] countWords(String[] input) {
        int[] countWords = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            String a = input[i];
            int count = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[j].equals(a)) count++;
            }
            countWords[i] = count;
        }
        return countWords;
    }

    public static String[] convertTextToSortedArray(String input) {
        input = input.replaceAll("[,.;!:]", "");
        input = input.toLowerCase();
        Pattern pattern = Pattern.compile("\\s+");
        String[] inputArray = pattern.split(input);
        Arrays.sort(inputArray);
        return inputArray;
    }
}