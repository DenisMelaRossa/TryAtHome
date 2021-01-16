package Lesson4;

import java.util.Scanner;

public class Exersices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (int i = 1; i <= 3; i++) {
            System.out.println("3 * " + i + " = " + 3 * i);

        }
        for (int i = 0; i <20 ; i++) {
            if (7*i<100) {
                System.out.print(7 * i + " ");
            }
                    }
        int i=1;
        while (7*i<100){
            System.out.print(7*i+" ");
            i++;
                    }
        System.out.println();
        int j=1;
        while (j<=512){

            System.out.print(j+" ");
            j*=2;
        }

        int pelmen=0;
        while (pelmen<=10){


            if (pelmen==5){
                System.out.println("lucky one");
                break;

            }
            System.out.println(pelmen);
            pelmen++;

        }
    }
}
