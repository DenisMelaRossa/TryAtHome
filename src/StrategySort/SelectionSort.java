package StrategySort;

public class SelectionSort implements SortStrategy {
    @Override
    public int[] sort(int[] array){
        for (int i=0; i<array.length;i++){
            for (int j=i; j<array.length; j++){
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

}

