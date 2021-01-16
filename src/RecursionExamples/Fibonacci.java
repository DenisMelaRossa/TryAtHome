package RecursionExamples;

import java.sql.Array;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n=25;
        long[] memorization=new long[n+1];
        Arrays.fill(memorization,-1);

        System.out.println(fibonacci(n,memorization));
    }

     public static long fibonacci(int n, long[] memorization){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if(memorization[n]!=-1){
            return memorization[n];
        }
        long result= fibonacci(n-1,memorization)+fibonacci(n-2,memorization);
        memorization[n]=result;
        return result;
     }
}
