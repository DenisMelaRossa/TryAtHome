package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharSlash {
    public static void main(String[] args) {
        String regex="\\";
        String input="absc\\drte";
        Pattern pattern= Pattern.compile(Pattern.quote(regex));
        Matcher matcher=pattern.matcher(input);

        if(matcher.find()){
            System.out.println(matcher.start());
        }
    }
}
