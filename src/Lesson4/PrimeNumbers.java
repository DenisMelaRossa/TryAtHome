package Lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        int count=0;
        for (int j = 2; j < a; j++) {
            boolean prime = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime==true){
                System.out.print(j+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
