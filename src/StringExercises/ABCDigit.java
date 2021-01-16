package StringExercises;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ABCDigit {
    public static void main(String[] args) {
        String input = "abc4 bv ghabc4 abcabc37";
        String regex = "abc(\\d)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String indexStart = "";
        String indexEnd = "";
        while (matcher.find()) {
            indexStart = indexStart.concat(Integer.toString(matcher.start())) + " ";
            indexEnd = indexEnd.concat(Integer.toString(matcher.end())) + " ";
        }
        System.out.println(indexStart);
        System.out.println(indexEnd);

        String[] startString = indexStart.split("\\s");
        String[] endString = indexEnd.split("\\s");
        int[] intIndexStart = new int[startString.length];
        int[] intIndexEnd = new int[endString.length];
        for (int i = 0; i < startString.length; i++) {
            intIndexStart[i] = Integer.parseInt(startString[i]);
            intIndexEnd[i] = Integer.parseInt(endString[i]);
        }

        System.out.println(Arrays.toString(intIndexStart));
        System.out.println(Arrays.toString(intIndexEnd));
        String result = input.substring(0, intIndexStart[0]);
        System.out.println(result);
        for (int i = 0; i < intIndexStart.length - 1; i++) {
            result = result.concat(input.substring(intIndexEnd[i]-1, intIndexStart[i + 1]));
            System.out.println(result);
        }
        System.out.println(result);
        result = result.concat(input.substring(intIndexEnd[intIndexEnd.length-1]-1));
        System.out.println(result);

    }
}
