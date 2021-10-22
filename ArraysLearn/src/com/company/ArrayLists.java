package com.company;

import java.util.ArrayList;

public class ArrayLists {

    public static ArrayList<String> pizzaList = new ArrayList<>();

    public static void menuSetup(){
        pizzaList.add("blank");
        pizzaList.add("Hawaii");
        pizzaList.add("Mushroom & ham");
        pizzaList.add("4 cheese");
        pizzaList.add("pepperoni");
    }

    public static void addPizza(String newPizza){
        pizzaList.add(newPizza);
    }


    public static String getPizza(int index){
        return pizzaList.get(index);
    }

    public static void getAllPizzas(){
        for (String pizza :
                pizzaList) {
            System.out.println(pizza);
        }
    }

    public static void updatePizza(){
        pizzaList.add("Pepperoni");
    }

    public static void deletePizza(){
        pizzaList.add("Pepperoni");
    }
}
