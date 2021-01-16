package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharsABC {
    public static void main(String[] args) {
        String regex="T{2,3}";
        String input="TTTTTTTT";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
