package Practice;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x from 1 to 3: ");
        int x=scanner.nextInt();
        System.out.println("Enter y from 1 to 3: ");
        int y=scanner.nextInt();

        switch(x){
            case(1):
                System.out.println(y);
                break;
            case(2):
                System.out.println(x);
                break;
            case(3):
                System.out.println(x);
                break;
        }
    }
}
