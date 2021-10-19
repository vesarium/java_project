package com.vesarium.main;

public class Yacht {
	
	String yachtName;
	int yachtLength;
	int displacement;
	private int speed;
	private int yachtMaxSpeed;
	
	public Yacht() {
		
	}
	
	public Yacht(String yachtName, int yachtLength,  int displacement) {
		this.yachtName = yachtName;
		this.displacement = displacement;
		this.yachtLength = yachtLength;
	}
	
	public static void main(String[] args){		
		
		
	
	}
	
	public void showYachtData() {		
		System.out.println("This yacht details: ");
		System.out.println("Yacht name: " + this.yachtName);
		System.out.println("Yacht length: " + this.yachtLength);
		System.out.println("Yacht displacement: " + this.displacement);		
	    
	}
	
	public String getYachtName() {		
	    return this.yachtName;
	}
	
	public int getYachtDisplaement() {		
	    return this.displacement;
	}
	
	public int getYachtLength() {		
	    return this.yachtLength;
	}
	
	public boolean setSpeed(int speedValue) {		
		if (speedValue < this.yachtMaxSpeed) {
			this.speed = speedValue;
			return true;
		} else {
			return false;
		}
	    
	}
	
	
	
	

}
