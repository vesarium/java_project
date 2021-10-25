package com.company;
import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> garage = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        garage.add(vehicle);
    }

    public Vehicle getVehicle(int id){ return garage.get(id); }

    public int countVehicles(){ return garage.size(); }

    public void removeVehicle(int id){ garage.remove(id); }

    public void updateVehicle(int id, Vehicle vehicle){ garage.set(id, vehicle); }

    public void clearGarage(){ garage.clear(); }


}
