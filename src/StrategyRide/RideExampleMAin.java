package StrategyRide;

import org.w3c.dom.ls.LSOutput;

public class RideExampleMAin {
    public static void main(String[] args) {
        RideStrategy car = new CarStrategy();
        car.ride();

        RideStrategy bike= new BikeStrategy();
        bike.ride();

        RideStrategy walk= new WalkStrategy();
        walk.ride();

        WalkStrategy walk2= new WalkStrategy();
        walk2.ride();
    }
}