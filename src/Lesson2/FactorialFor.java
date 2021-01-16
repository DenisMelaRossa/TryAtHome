package Lesson2;

public class FactorialFor {
    public static void main(String[] args) {
        int factorial = 1;
        int a = 5;

        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial a is " + factorial);
    }
}
