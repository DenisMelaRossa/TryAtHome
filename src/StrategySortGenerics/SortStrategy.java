package StrategySortGenerics;

public interface SortStrategy <T extends Comparable<T>> {
    <T extends Comparable <T>> T[] sort(T[] array);
}
