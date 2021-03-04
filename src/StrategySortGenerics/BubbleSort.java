package StrategySortGenerics;

import java.util.Arrays;

public class BubbleSort <T extends Comparable<T>> implements SortStrategy <T>{


    public <T extends Comparable<T>> T[]  sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1].compareTo(array[j])<0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}

