package StringExercises;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FilterNumbers {
    public static void main(String[] args) {
        String input="fkd 45 gh 56 fj0k7";
        String regex="\\d+";
        String result="";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            result=result.concat(matcher.group().concat(" "));
        }
        System.out.println(result);
        String[] arrayResult=result.split("\\s");
        System.out.println(Arrays.toString(arrayResult));
    }
}
