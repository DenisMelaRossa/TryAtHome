package Lesson2;

public class FactorialDoWhile {
    public static void main(String[] args) {
        int i = 1;
        int factorial = 1;
        int a = 6;

        do {
            factorial = factorial * i;
            i++;
        } while (i <= a);

        System.out.println("Factorial a is " + factorial);

    }
}
