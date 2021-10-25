package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Garage myGarage = new Garage();
        SUV bmwx5 = new SUV("SUV", 3, 150,5, 20,40, "Pickup");
        MPV galaxy = new MPV("MPV",2, 130, 7, 50, 1000,true);
        Coupe oka = new Coupe("Coupe",0.5,40, 4, 50,200, false);

        myGarage.addVehicle(bmwx5);
        myGarage.addVehicle(galaxy);
        myGarage.addVehicle(oka);

        bmwx5.getOutOfHere();

        galaxy.engineStart();
        galaxy.goCamping();

        System.out.println(myGarage.getVehicle(0).fixVehicle());

        myGarage.updateVehicle(0, galaxy);


        myGarage.removeVehicle(1);
        System.out.println(myGarage.countVehicles()); // check


        myGarage.clearGarage(); //removing all vehicles
        System.out.println(myGarage.countVehicles()); // check


    }
}
