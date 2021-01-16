package GetterSetter;

import java.util.Arrays;

public class MainFactorialFibonacciWithExceptions {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(
                    FactorialFibonacciWithExceptions.algorithmFactorialFibonacci(2, 1, -4)));
        } catch(FactorialFibonacciAlgorithmExceptions e1){
            System.out.println(e1+ " problem");
        } catch(FactorialFibonacciLoopTypeExceptions e2){
            System.out.println(e2+ " problem");
        } catch(FactorialFibonacciInputExceptions e3){
            System.out.println(e3 +" problem");
        }

        System.out.println("check it");
    }
}
