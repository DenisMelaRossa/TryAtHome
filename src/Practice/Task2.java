package Practice;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;
        int e = 30;
        System.out.println(a + "," + b + "," + c + "," + d + "," + e);

        int t = a;
        a = b;
        b = c;
        c = d;
        d = e;
        e = t;
        System.out.println(a + "," + b + "," + c + "," + d + "," + e);
    }
}

