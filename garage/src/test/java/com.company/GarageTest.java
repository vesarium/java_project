package com.company;

import com.company.Garage;
import com.company.Vehicle;
import junit.framework.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    private Vehicle vehicle;
    private static Garage myGarage;

    @BeforeAll
    public static void setup(){
        System.out.println("setupp");
        myGarage = new Garage();
        Vehicle vehicle = new Vehicle("coupe", 2.5, 250, 4, 20);
    }


    @Test
    void addVehicle() {
        myGarage.addVehicle(vehicle);
        Assert.assertEquals(1, myGarage.countVehicles());
    }

    @Test
    void getVehicle() {
        myGarage.addVehicle(vehicle);
        Assert.assertTrue(myGarage.getVehicle(0) instanceof Vehicle);
    }

    @Test
    void countVehicles() {
        myGarage.addVehicle(vehicle);
        Assert.assertEquals(1, myGarage.countVehicles());
    }

    @Test
    void removeVehicle() {
        myGarage.addVehicle(vehicle);
        myGarage.removeVehicle(0);
        Assert.assertEquals(0, myGarage.countVehicles());
    }

    @Test
    void updateVehicle() {

    }

    @Test
    void clearGarage() {
    }

    @AfterAll
    static void afterTest(){
        System.out.println("This is after all tests");

    }
}