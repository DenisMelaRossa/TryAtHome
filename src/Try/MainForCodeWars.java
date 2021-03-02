package Try;

import java.util.Arrays;

public class MainForCodeWars {
    public static void main(String[] args) {
        long n=29797335228L;
        System.out.println(Arrays.toString(digitize(n)));
    }
    public static int[] digitize(long n) {
        int count=0;
        long temp=n;
        while(temp!=0){
            temp=temp/10;
            count++;

        }

        int[] result=new int[count];
        for(int i=0; i<count;i++){
            result[i]=(int)(n%10);
           n/=10;
        }
        return result;

    }
}
