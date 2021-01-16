package GetterSetter;

public class FactorialFibonacci {
    public static int[] FactorialFibonacci(int algorithmId, int loopType, int number) {
        if (algorithmId > 2 || algorithmId < 0 || loopType > 3 || loopType < 0 || number < 0) {
            System.out.println("incorrect input");
        }
        return algorithmFactorialFibonacci(algorithmId, loopType, number);
    }

   public static  int[] algorithmFactorialFibonacci(int algorithmId, int loopType, int number) {
        if (algorithmId == 1 && loopType == 1) return Fibonacci.fibonacciWhile(number);
        if (algorithmId == 1 && loopType == 2) return Fibonacci.fibonacciDoWhile(number);
        if (algorithmId == 1 && loopType == 3) return Fibonacci.fibonacciFor(number);
        if (algorithmId == 2 && loopType == 1) return Factorial.factorialWhile(number);
        if (algorithmId == 2 && loopType == 2) return Factorial.factorialDoWhile(number);
        if (algorithmId == 2 && loopType == 3) return Factorial.factorialFor(number);
        else {
            int[] result = {-1};
            return result;
        }
    }
}
