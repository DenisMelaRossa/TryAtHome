package StringExercises;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringByAlphabeticOrder3 {
    public static void main(String[] args) {
        String input = "text here, oh a a oh jo jo try To split, and order them To to to";
        String emptyInput="a has a";
        System.out.println(groupWordsByAlphabet(emptyInput));
        System.out.println(groupWordsByAlphabet(input));
    }

    public static String groupWordsByAlphabet(String input) {
        String[] inputArray = convertTextToSortedArray(input);
        String result = "";
        for (char index = 'a'; index <= 'z'; index++) {

            int count = 0;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i].charAt(0) == index) {
                    count++;
                }
            }
            if (count > 0) {
                String charToString = String.valueOf(index);
                result = result
                        .concat(charToString.toUpperCase())
                        .concat(":")
                        .concat(listWordsByLetter(inputArray, index))
                        .concat("\n");
            }
        }
        return result;
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
        input = input.trim();
        Pattern pattern = Pattern.compile("\\s+");
        String[] inputArray = pattern.split(input);
        Arrays.sort(inputArray);
        return inputArray;
    }

    public static String listWordsByLetter(String[] inputArray, char index) {
        int countWordsbyLetter = 0;
        String result = "";
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].charAt(0) == index) countWordsbyLetter++;

            if (countWordsbyLetter == 1 && inputArray[i].charAt(0) == index) {
                result = result.concat("\t")
                        .concat(inputArray[i])
                        .concat(" ")
                        .concat(String.valueOf(countWords(inputArray)[i]));
            } else if (countWordsbyLetter > 1 && inputArray[i].charAt(0) == index
                    && !inputArray[i].equals(inputArray[i - 1])) {
                result = result.concat("\n\t")
                        .concat(inputArray[i])
                        .concat(" ")
                        .concat(String.valueOf(countWords(inputArray)[i]));
            }
        }
        return result;
    }
}