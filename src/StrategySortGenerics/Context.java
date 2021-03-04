package StrategySortGenerics;

public class Context <T extends Comparable<T>> {
    private SortStrategy sortStrategy;

    public Context(){
    }

    public void setSortStrategy(SortStrategy <T> sortStrategy){
        this.sortStrategy=sortStrategy;
    }

    public <T extends Comparable<T>> T[] executeStrategy(T[] array){

        return (T[]) sortStrategy.sort(array);
    }

}

