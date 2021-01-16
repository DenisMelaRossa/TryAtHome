package GetterSetter;

public class FactorialFibonacciWithExceptions {
    public static int[] algorithmFactorialFibonacci(int algorithmId, int loopType, int number)
            throws FactorialFibonacciAlgorithmExceptions, FactorialFibonacciLoopTypeExceptions,
            FactorialFibonacciInputExceptions, IllegalArgumentException {
        if (algorithmId > 2 || algorithmId <= 0) {
            throw new FactorialFibonacciAlgorithmExceptions();
        }
        if (loopType > 3 || loopType <= 0) {
            throw new FactorialFibonacciLoopTypeExceptions();
        }
        if (number < 0) {
            throw new FactorialFibonacciInputExceptions();
        }
        if (algorithmId == 1 && loopType == 1) return Fibonacci.fibonacciWhile(number);
        if (algorithmId == 1 && loopType == 2) return Fibonacci.fibonacciDoWhile(number);
        if (algorithmId == 1 && loopType == 3) return Fibonacci.fibonacciFor(number);
        if (algorithmId == 2 && loopType == 1) return Factorial.factorialWhile(number);
        if (algorithmId == 2 && loopType == 2) return Factorial.factorialDoWhile(number);
        if (algorithmId == 2 && loopType == 3) return Factorial.factorialFor(number);
        else {
            throw new IllegalArgumentException();
        }
    }
}
