package Try;

public class Main {

    public static void main(String[] args) {
        var a = 5;
        var b = 3;
        var c = 4;
        double p = (a + b + c) / 2d;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(S);
        System.out.println("Try GitHub");
        System.out.println("Try more");
        System.out.println("Even more");

        System.out.println(solution("denis"));

    }

    public static String solution(String str) {
        char[] strArray=str.toCharArray();
        for(int i=0; i<strArray.length/2;i++){
            char temp=strArray[i];
            strArray[i]=strArray[strArray.length-i-1];
            strArray[strArray.length-i-1]=temp;

        }
        String result="";
        for(int i=0; i<strArray.length;i++){
            result.concat(String.valueOf(strArray[i]));
        }
        // Your code here...
        return result;
    }

}
