package Lesson4;

public class Sequence {
    public static void main(String[] args) {
        int a1=3;
        int a2=2;
        int a3;
        for (int i = 0; i <11 ; i++) {
            a3=2*a1-2;
            a1=a2;
            a2=a3;
            System.out.print(a3+ " ");
        }
    }
}
