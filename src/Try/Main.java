package Try;

public class Main {

    public static void main(String[] args) {
        var a = 5;
        var b = 3;
        var c = 4;
        double p = (a + b + c) / 2d;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(S);

    }
}
