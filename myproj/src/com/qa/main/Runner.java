package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myMethod();
		
		
		Task1.myFunc("My own text to print out");
		
		String[] toppings = {"cheese","pepperoni"};
		
		Task1.putPizzaTopping(toppings);
		
		System.out.println(Task1.favNumber());

	}
	
	public static void myMethod() {
		System.out.println("Hello from myMethd");
	}

}

