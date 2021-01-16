package Lesson4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Blue, with mustache, with rabbits");
        for (int i = 0; i < 3; i++) {


        System.out.print(" Enter your answer: ");
        String a = scanner.next();
        switch (a) {
            case "Trolly":
                System.out.println("Correct");
                break;
            case "Give up":
                break;
            default:
                System.out.println("Try again");

                      }

        }

    }
}
