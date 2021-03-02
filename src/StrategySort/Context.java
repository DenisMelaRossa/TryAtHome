package StrategySort;

public class Context {
    private SortStrategy sortStrategy;

    public Context(){
    }
    public void setSortStrategy(SortStrategy sortStrategy){
        this.sortStrategy=sortStrategy;
    }

    public int[] executeStrategy(int[] array){
        return sortStrategy.sort(array);
    }
}
