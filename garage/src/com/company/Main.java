package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SUV bmwx5 = new SUV(3, 150,5, 20, "Pickup");
        MPV galaxy = new MPV(2, 130, 7, 1000, true);
        Coupe oka = new Coupe(0.5,40, 4, 50, false);

        bmwx5.getOutOfHere();

        galaxy.engineStart();
        galaxy.goCamping();

        galaxy.setTowBar(false);
        galaxy.goCamping();



    }
}
