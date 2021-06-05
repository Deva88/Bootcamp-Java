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

	public static void dice() {
		int a = 1 + (int) (Math.random() * 6);
		int b = 1 + (int) (Math.random() * 6);
		int sum = a + b;

		System.out.println("First of Dice :: " +a);
		System.out.println("Second of Dice :: " +b);
		System.out.println("Sum of two Dice :: " +sum);
	}

	//Day-2
	public static void randomMinMax(){
		int number = 5;
		double random1 = Math.random();
		double random2 = Math.random();
		double random3 = Math.random();
		double random4 = Math.random();
		double random5 = Math.random();

		System.out.println("Random value 1 :: " +random1);
		System.out.println("Random value 2 :: " +random2);
		System.out.println("Random value 3 :: " +random3);
		System.out.println("Random value 4 :: " +random4);
		System.out.println("Random value 5 :: " +random5);

		double min     = Math.min(random1, Math.min(random2, Math.min(random3, Math.min(random4, random5))));
		double max     = Math.max(random1, Math.max(random2, Math.max(random3, Math.max(random4, random5))));
		double average = (random1 + random2 + random3 + random4 + random5) / number;

		System.out.println("Average = " + average);
		System.out.println("Min     = " + min);
		System.out.println("Max     = " + max);
	}


	public static void powerOf(int n) {
		for(int i = 1; i<=n;i++) {
			System.out.println(Math.pow(2,i));
		}
	}

	
	public void flipCoin(int numberOfTimesFlipCount) {
		int percentageOfHeads, percentageOfTails;
		int headsCounts = 0, tailsCounts = 0;
		for (int i = 0; i < numberOfTimesFlipCount; i++) {
			if (Math.random() > 0.5) {
				headsCounts++;
			} else {
				tailsCounts++;
			}
		}
		System.out.println("heads : " + headsCounts);
		System.out.println("tails : " + tailsCounts);
		// calculation of percentage
		percentageOfHeads = headsCounts * 100 / numberOfTimesFlipCount;
		percentageOfTails = tailsCounts * 100 / numberOfTimesFlipCount;

		System.out.println("Percentage for heads : " + percentageOfHeads);
		System.out.println("Percentage for tails : " + percentageOfTails);
	}


}