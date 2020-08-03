package com.oops;

public class Array1 {
	
	void arrMethod() {
		
		String arr[] = new String[7];
		
		arr[0] = "Bujji";
		arr[1] = "Krish";
		arr[2] = "Baby";
		arr[3] = "Chaitu";
		arr[4] = "Nani";
		arr[5] = "Shrey";
		arr[6] = "Vicky";
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		for(String s:arr) {
			
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		new Array1().arrMethod();
	}
}