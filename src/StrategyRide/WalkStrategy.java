package StrategyRide;

public class WalkStrategy implements RideStrategy{
    @Override
    public void ride(){
        System.out.println("go");
    }
}
