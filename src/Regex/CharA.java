package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharA {
    public static void main(String[] args) {
        String regex="a";
        String input="asna";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        if (matcher.find()){
            System.out.println("new "+matcher.start());
        }

        while (matcher.find()){
            System.out.println(matcher.start()+" ");
            System.out.println(matcher.end());
            System.out.println(input.substring(matcher.start(),matcher.end()));
        }



    }
}
