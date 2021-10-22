package com.company;

public class Car {

    private double engineSize;
    private int enginePower;
    private int seatsAmount;
    private int fuelLeft;

    public double getEngineSize() {
        return engineSize;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public int getFuelLeft() {
        return fuelLeft;
    }

    public void setFuelLeft(int fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public boolean engineStart(){
        boolean res= false;

        if(fuelLeft>0){
            res=true;
            if (engineSize<1){
                System.out.println("dzzzzz");
            }else if(engineSize>=1 && engineSize<2){
                System.out.println("BzBzzzz");
            }else if(engineSize>=2 && engineSize<3){
                System.out.println("BrBrrrrr");
            }else if(engineSize>=3){
                System.out.println("RaTatata");
            }

        }
        return res;
    }

    public Car(double engineSize, int enginePower, int seatsAmount) {
        super();
        this.engineSize = engineSize;
        this.enginePower = enginePower;
        this.seatsAmount = seatsAmount;
        this.fuelLeft = 20;
    }

}
