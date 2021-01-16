package Lesson2;

public class FactorialWhile {
    public static void main(String[] args) {
        int i = 1;
        int factorial = 1;
        int a = 6;

        while (i <= a) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial a is " + factorial);
    }
}
