package Lesson3;

import java.util.Scanner;

public class FactorialByMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Factorial of the number by While is: " + factorialWhile(number));
        System.out.println("Factorial of the number by Do While is: " + factorialDoWhile(number));
        System.out.println("Factorial of the number by For is: " + factorialFor(number));
    }

    public static int factorialWhile(int a) {
        int i = 1;
        int factorial = 1;
        while (i <= a) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

    public static int factorialDoWhile(int a) {
        int i = 1;
        int factorial = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= a);
        return factorial;
    }

    public static int factorialFor(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
