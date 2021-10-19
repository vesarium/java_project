package com.qa.main;

public class Task1 {
	
	
	public static void myFunc(String textToPrint) {
		System.out.println(textToPrint);
		
	}
	
	public static void putPizzaTopping(String[] ingridients) {
		for (int i = 0; i < ingridients.length; i++) {
			System.out.println(ingridients[i]);		
		}
		
	}
	
	public static int favNumber() {
	    int result = (int)(Math.random()*101);	
		return result;
	}
	

}
