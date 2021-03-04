package StrategyRide;

public class CarStrategy implements RideStrategy {
    @Override
    public void ride(){
        System.out.println("drive");
    }
}
