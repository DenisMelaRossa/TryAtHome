package StrategySortGenerics;

import java.util.Arrays;

public class StrategyExampleMain {
    public static void main(String[] args) {
        Integer[] array={8,3,2,9};
        String[] arrayString={"first","second","fifth","eighth"};
        Context context= new Context();

        context.setSortStrategy( new SelectionSort());
        Integer[] resultSelectionSort= (Integer[]) context.executeStrategy(array);
        System.out.println(Arrays.toString(resultSelectionSort));

        context.setSortStrategy( new BubbleSort());
        String[] resultBubbleSort= (String[]) context.executeStrategy(arrayString);
        System.out.println(Arrays.toString(resultBubbleSort));
    }
}
