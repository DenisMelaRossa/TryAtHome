package Try;

public class regextry {
    public static void main(String[] args) {
        String input="2dfjndf22";
        String regex="(\\w)(.*)(\\1)";
        String result=input.replaceAll(regex,"$2$3");
        System.out.println(result);
    }
}
