package Lesson4;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter number: ");
        int a=scanner.nextInt();

        for (int i = 1; i <=a ; i++) {
            if (a%i==0){
                System.out.println(i);
               // a=a/i;
            }

        }
    }
}
