package com.company;

public class MPV extends Car{
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

    public MPV(double engineSize, int enginePower, int seatsAmount, int bootVolume, boolean towBar) {
        super(engineSize, enginePower, seatsAmount);
        this.bootVolume = bootVolume;
        this.towBar = towBar;
    }
}
