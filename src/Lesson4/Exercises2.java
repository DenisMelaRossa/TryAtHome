package Lesson4;
import java.util.Scanner;
public class Exercises2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }


        for (int i = 1; i <= 10; i++) {
            for (char j = 'а'; j < 'л'; j++) {
                if(j!='й') {
                    System.out.print(j + "" + i + " ");
                }
            }

            System.out.println();
        }
}
        }


