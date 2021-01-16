package StringExercises;

public class Matcher {
    public static void main(String[] args) {
        String input = "asfffdddaakak";
        String myStr = input.replaceAll("(\\w)\\1+", "");
        System.out.println(myStr);
    }
}
