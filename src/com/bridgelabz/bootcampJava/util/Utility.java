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


	public static void leep(int year) {
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			System.out.println( year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
	}

	
	public static void monthDay(int month, int day) {
		boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
				|| (month == 4 && day >=  1 && day <= 30)
				|| (month == 5 && day >=  1 && day <= 31)
				|| (month == 6 && day >=  1 && day <= 20);

		System.out.println(isSpring);
	}
}
