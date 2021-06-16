package com.bridgelabz.bootcampJava.util;

public class MathFunction {

	//Day-5

	/*
	 * return a sin of an HarmonicSeries
	 */	
	public static void harmonicSeries(int num) {
		for ( int count = 1 ; count<= num ; count++ ) {
			if(count == num) {
				System.out.print(" 1/" +count);
			}
			else
				System.out.print(" 1/" +count+ " + ");
		}
	}
	/*
	 * return a sin of an angle
	 */

	public static void isSin(double degreesSin) {
		double radians = Math.toRadians(degreesSin);
		double sinValue = Math.sin(radians);

		System.out.println("sin(" +degreesSin+ ") =" +sinValue);
	}

	/*
	 * return a Cos of an angle
	 */

	public static void isCos(double degreesCos) {
		double radians = Math.toRadians(degreesCos);
		double cosValue = Math.cos(radians);
		System.out.println("sin(" +degreesCos+ ") =" +cosValue);
	}


	/*
	 * method for finding prime number or not
	 */

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
