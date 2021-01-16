package Lesson4.Vertex;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Enter number: ");
            a = scanner.nextInt();
        } while (a <= 3);

        int[] array = new int[a];
        int evencount = 0;
        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random() * a);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                evencount++;
            }
        }
        int[] even=new int[evencount];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                even[j]=array[i];
                j++;
            }
        }
        System.out.println();
        for (int i = 0; i < evencount; i++) {
            System.out.print(even[i]+" ");

        }
    }
}
