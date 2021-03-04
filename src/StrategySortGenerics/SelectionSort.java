package StrategySortGenerics;

public class SelectionSort <T extends Comparable <T>> implements SortStrategy <T> {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array){
        for (int i=0; i<array.length;i++){
            for (int j=i; j<array.length; j++){
                if (array[i].compareTo(array[j])>0){
                    T temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

}

