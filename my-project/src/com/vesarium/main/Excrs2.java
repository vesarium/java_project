package com.vesarium.main;

public class Excrs2 {
	
	public static void main (String[] args){
		
		String hLetter = "H";
		String llLetters= "ll";
		
		char space = ' ';
		int eLetter = 3;
		int oLetter = 0;
		double ooLetters = 0.000000d;
	
		float myFloat = 5.0f;
		boolean myBool = false;
	
		System.out.print(hLetter + 3 +llLetters.format("%S" ,llLetters) + oLetter + space + 'W' + String.format("%.6f",ooLetters) + "r1d" + space + myFloat + space + myBool);
	}

}
