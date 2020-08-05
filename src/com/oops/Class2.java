package com.oops;

public class Class2 implements Interface2 {

	public int rateOfInterest() {
		
		return 7;	
	}
	
	public void method1() {
		
		System.out.println("New Change in Remote Repository");
		System.out.println("Method 1 is invoked");		
	}
	
	public static void main(String[] args) {
		
		Interface2 obj = new Class2();
		obj.method2();
	}
}
