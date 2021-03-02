package StringExercises;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lesson10Task5 {
    public static void main(String[] args) {
        String regex1="(\\w+)\\s(\\w+)";
        String regex2="abc(\\d)";
        String input = "2Johehn Smithh";
        //Pattern pattern = Pattern.compile("abc\\d");
        //Matcher matcher=pattern.matcher(input);

        String mystr=input.replaceAll(regex2,"$1");
        String mystr2=input.replaceAll(regex1,"$2-$1");
        String mystr3=input.replaceAll("(\\w)(.+)\\1+","$2");
        System.out.println(mystr);
        System.out.println(mystr2);
        System.out.println(mystr3);
    }
}
