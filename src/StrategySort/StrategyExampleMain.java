package StrategySort;

import java.util.Arrays;

public class StrategyExampleMain {
    public static void main(String[] args) {
        int[] array={8,3,2,9};
        Context context= new Context();

        context.setSortStrategy(new BubbleSort());
        int[] resultBubbleSort=context.executeStrategy(array);
        System.out.println(Arrays.toString(resultBubbleSort));

        context.setSortStrategy( new SelectionSort());
        int[] resultSelectionSort=context.executeStrategy(array);
        System.out.println(Arrays.toString(resultSelectionSort));
    }
}
