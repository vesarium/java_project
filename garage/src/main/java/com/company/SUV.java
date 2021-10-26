package com.company;

public class SUV extends Vehicle{

    private int winchPower;
    private String subType;

    public int getWinchPower() {
        return winchPower;
    }

    public String getBodyType() {
        return subType;
    }

    public void setWinchPower(int winchPower) {
        this.winchPower = winchPower;
    }

    public void getOutOfHere(){
        System.out.println("winch...winch...winch...");
    }

    public SUV(String bodyType, double engineSize, int enginePower, int seatsAmount, int fuelLeft, int winchPower, String subType) {
        super(bodyType, engineSize, enginePower, seatsAmount, fuelLeft);
        this.winchPower = winchPower;
        this.subType = subType;
    }
}
