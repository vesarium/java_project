package com.company;

public class MPV extends Vehicle{
    int bootVolume;
    boolean towBar;

    public int getBootVolume() {
        return bootVolume;
    }

    public boolean isTowBar() {
        return towBar;
    }

    public void setTowBar(boolean towBar) {
        this.towBar = towBar;
    }

    public void goCamping(){
        if (towBar==true){
            System.out.println("Let's go with trailer");
        } else {
            System.out.println("Wow, going with tents today!");
        }
    }
    public MPV(String bodyType, double engineSize, int enginePower, int seatsAmount, int fuelLeft, int bootVolume, boolean towBar) {
        super(bodyType, engineSize, enginePower, seatsAmount, fuelLeft);
        this.bootVolume = bootVolume;
        this.towBar = towBar;
    }
}
