package com.company;

public class Yacht {
    public static int yachtLength;
    public static int yachtCost;
    public static String yachtType;
    public static String yachtName;
    public static String yachtOwner;

    public Yacht(int yachtLength, int yachtCost, String yachtType, String yachtName, String yachtOwner){
        this.yachtLength = yachtLength;
        this.yachtCost = yachtCost;
        this.yachtType = yachtType;
        this.yachtName = yachtName;
        this.yachtOwner = yachtOwner;
    }

    public void changeOwner(String newOwner){
        yachtOwner = newOwner;
        System.out.println("Owner is changed");
    }

    public void changeName(String newName){
        yachtName = newName;
        System.out.println("Yache name is changed");
    }

    public void printDetails(){
        System.out.println("Yacht length is: "+ yachtLength);
        System.out.println("Yacht cost is: "+ yachtCost);
        System.out.println("Yacht type is: "+ yachtType);
        System.out.println("Yacht name is: "+ yachtName);
        System.out.println("Yacht owner is: "+ yachtOwner);
    }


}
