package com.oops;

public interface Interface2 {
	
	int id = 7;
	
	int rateOfInterest();
	void method1();
	
	default void method2() {
		
		System.out.println("Interface new Default Method");
	}
}