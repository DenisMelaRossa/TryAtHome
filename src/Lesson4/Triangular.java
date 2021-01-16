package Lesson4;

public class Triangular {
    public static void main(String[] args) {
        long c = 1;

        for (int i = 1; i < 15; i++) {
            System.out.println(c);
            c = (long) Math.pow(10, i) + 1;

        }
        for (int i = 14; i >= 1; i--) {

            long d = (long) Math.pow(10, i) + 1;
            System.out.println(d);
        }
    }
}
