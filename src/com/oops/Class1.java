package com.oops;

public class Class1 implements Interface1 {

	public int rateOfInterest() {
		
		return 11;
	}
	
	public static void main(String[] args) {
		
		Interface1 obj = new Class1();
		System.out.println("Interest Rate: " + obj.rateOfInterest());
	}
}