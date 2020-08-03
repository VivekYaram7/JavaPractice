package com.oops;

public class Polymorphism2 extends Polymorphism1 implements Interface1 {

	public int rateOfInterest() {
		
		return 9;
	}
	
	public int intRate() {
		
		int rate = super.rateOfInterest();
		return rate;
	}
	
	public static void main(String[] args) {
		
		Polymorphism2 obj1 = new Polymorphism2();
		
		obj1.method1();
		int rateOfInterest1 = obj1.rateOfInterest();
		System.out.println("Rate Of Interest1: " + rateOfInterest1);
		
		Polymorphism1 obj2 = new Polymorphism2();
		
		int rateOfInterest2 = obj2.rateOfInterest();
		System.out.println("Rate Of Interest2: " + rateOfInterest2);
		
		int rateOfInterest3 = obj1.intRate();
		System.out.println("Rate Of Interest3: " + rateOfInterest3);
		
		obj2.method2();
	}
}