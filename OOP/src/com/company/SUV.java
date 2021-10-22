package com.company;

public class SUV extends Car{

    private int winchPower;
    private final String bodyType;


    public int getWinchPower() {
        return winchPower;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setWinchPower(int winchPower) {
        this.winchPower = winchPower;
    }

    public void getOutOfHere(){
        System.out.println("winch...winch...winch...");
    }

    public SUV(double engineSize, int enginePower, int seatsAmount, int winchPower, String bodyType) {
        super(engineSize, enginePower, seatsAmount);
        this.winchPower = winchPower;
        this.bodyType = bodyType;
    }

}
