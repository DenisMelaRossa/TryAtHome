package Lesson4.Vertex;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        for (int i = 0; i < 10; i++) {

            {
                System.out.println("Enter number: ");
                int a = scanner.nextInt();
                if (a % 2 == 0) {
                    b = a;
                    break;
                }
            }
        }

        int[] array = new int[b];
        for (int i = 0; i < b; i++) {
            array[i] = (int) (Math.random() * 10) - 5;
            System.out.print(array[i] + " ");
        }
        int sumleft = 0;
        int sumright = 0;
        for (int i = 0; i < b / 2; i++) {
            sumleft += Math.abs(array[i]);
            sumright += Math.abs(array[b - i-1]);
        }
        if (sumleft>sumright){
            System.out.println("Left "+sumleft);
        } else{
            System.out.println("right "+sumright);
        }
    }
}
