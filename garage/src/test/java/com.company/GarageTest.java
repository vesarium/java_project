package com.company;

import com.company.Garage;
import com.company.Vehicle;
import junit.framework.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    private Vehicle vehicle;
    private Garage myGarage;

    @BeforeAll
    private void setup(){
        System.out.println("setupp");
        myGarage = new Garage();
        Vehicle vehicle = new Vehicle("coupe", 2.5, 250, 4, 20);
    }

    @AfterEach
    public void resetGarage(){
        //myGarage.clearGarage();
    }


    @Test
    void addVehicle() {
        myGarage.addVehicle(vehicle);
        Assert.assertEquals(1, myGarage.countVehicles());
        myGarage.clearGarage();
    }

    @Test
    void getVehicle() {
        myGarage.addVehicle(vehicle);
        System.out.println(myGarage.getVehicle(0));
        Assert.assertTrue(myGarage.getVehicle(0) instanceof Vehicle);
        myGarage.clearGarage();
    }

    @Test
    void countVehicles() {
        myGarage.addVehicle(vehicle);
        Assert.assertEquals(1, myGarage.countVehicles());
        myGarage.clearGarage();
    }

    @Test
    void removeVehicle() {
        myGarage.addVehicle(vehicle);
        myGarage.removeVehicle(0);
        Assert.assertEquals(0, myGarage.countVehicles());
        myGarage.clearGarage();
    }

    @Test
    void updateVehicle() {

    }

    @Test
    void clearGarage() {
        myGarage.addVehicle(vehicle);
        myGarage.addVehicle(vehicle);
        myGarage.clearGarage();
        Assert.assertEquals(0, myGarage.countVehicles());
    }

    @AfterAll
    static void afterTest(){
        System.out.println("This is after all tests");

    }
}