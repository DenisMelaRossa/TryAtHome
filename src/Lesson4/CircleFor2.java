package Lesson4;

public class CircleFor2 {
    public static void main(String[] args) {


        for (int j = 0; j <= 3; j++) {

            for (int i = 0; i <= j; i++) {
                System.out.print("b");
                for (int k = i; k < 4-i-j; k++) {
                    System.out.print("a");
                }

            }

            System.out.println();
        }
    }
}
