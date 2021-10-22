package com.company;

public class Coupe extends Car{
    int topSpeed;
    boolean creditCardholder;

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isCreditCardholder() {
        return creditCardholder;
    }

    public void setCreditCardholder(boolean creditCardholder) {
        this.creditCardholder = creditCardholder;
    }

    public Coupe(double engineSize, int enginePower, int seatsAmount, int topSpeed, boolean creditCardholder) {
        super(engineSize, enginePower, seatsAmount);
        this.topSpeed = topSpeed;
        this.creditCardholder = creditCardholder;
    }
}
