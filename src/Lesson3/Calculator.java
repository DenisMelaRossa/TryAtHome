package Lesson3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.print("Enter the sign: ");
        char sign = scan.next().charAt(0);
        System.out.println("Result is: " + calculator(number1, sign, number2));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double calculator(int a, char sign, int b) {
        double result = 0;
        switch (sign) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = division(a, b);
                break;
            default:
                System.out.println("Incorrect sign");
        }
        return result;
    }
}
