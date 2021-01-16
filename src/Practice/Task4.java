package Practice;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a=scanner.nextInt();
        System.out.println("Enter number 2: ");
        int b=scanner.nextInt();
        System.out.println("Enter number 3: ");
        int c=scanner.nextInt();

        if (a%1.5<=b%1.5 && a%1.5<=c%1.5){
            System.out.println("a= "+a+" has the smallest remainder: "+a%1.5);
        } else if(b%1.5<=c%1.5){
            System.out.println("b= "+b+" has the smallest remainder: "+b%1.5);
        }else {
            System.out.println("c= "+c + " has the smallest remainder: " + c % 1.5);
        }
    }
}
