package Lesson4;
import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a= scanner.nextInt();
        int digitssum=0;

        while (a>0){
            digitssum=digitssum+a%10;
            a=a/10;
        }
        System.out.println(digitssum);
    }
}
