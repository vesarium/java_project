package com.company;

public class Coupe extends Vehicle{
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

    public Coupe(String bodyType, double engineSize, int enginePower, int seatsAmount, int fuelLeft, int topSpeed, boolean creditCardholder) {
        super(bodyType, engineSize, enginePower, seatsAmount, fuelLeft);
        this.topSpeed = topSpeed;
        this.creditCardholder = creditCardholder;
    }
}
