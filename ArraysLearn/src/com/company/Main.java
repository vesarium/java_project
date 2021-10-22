package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] myArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] myArr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        Arrays.myArray(myArr1, myArr2);
        ArrayLists.menuSetup();
        String newPizza = "Margarita";
        ArrayLists.addPizza(newPizza);

        //System.out.println(ArrayLists.getPizza(0));
        ArrayLists.getAllPizzas();
    }
}
