package com.bridgelabz.bootcampJava.util;

public class Utility {

	//Day-1
	
	public static void mathOpt(int a, int b, int c) {
		//int a=10, b=20, c=30;
		int operation1= a + b * c;
		int operation2= a * b + c;
		int operation3= c + a / b;
		int operation4= a % b + c;
		
		System.out.println("Operation one (a + b * c): "+operation1);
		System.out.println("Operation two (a * b + c): "+operation2);
		System.out.println("Operation Three (c + a / b): "+operation3);
		System.out.println("Operation Four (a % b + c): "+operation4);	
	}

}
