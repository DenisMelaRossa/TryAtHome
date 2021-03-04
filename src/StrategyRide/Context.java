package StrategyRide;

public class Context {
    private RideStrategy makeYouChoice;

    public Context(){
    }

    public void setStrategy (RideStrategy makeYouChoice){
        this.makeYouChoice=makeYouChoice;
    }
    public RideStrategy getRideStrategy(){
        return makeYouChoice;
    }
}
