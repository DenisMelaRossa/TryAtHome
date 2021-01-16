package StringExercises;

import java.util.Arrays;
import java.util.Scanner;

public class StringLessAverage {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Arrays.toString(lessAverage(n)));
    }
     public static String[] lessAverage(int n){
        String[] strLine = new String[n];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter line " + i + " :");
            strLine[i]=scanner.nextLine();
        }
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=strLine[i].length();
        }
        int average=sum/n;

        int count=0;
        for (int i = 0; i <n ; i++) {
            if(strLine[i].length()<=average){
                count++;
            }
        }
        String[] result=new String[2*count];
        int index=0;
        for (int i = 0; i <n ; i++) {
            if(strLine[i].length()<=average){
                result[index]=strLine[i];
                result[count+index]=String.valueOf(strLine[i].length());
                index++;
            }
        }
        return result;
    }
}
