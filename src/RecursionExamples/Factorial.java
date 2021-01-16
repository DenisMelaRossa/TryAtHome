package RecursionExamples;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        int result=1;
        if (n==0|| n==1){
            return 1;
        }else{
            result=n*factorial(n-1);

        }
        return result;
    }
}
