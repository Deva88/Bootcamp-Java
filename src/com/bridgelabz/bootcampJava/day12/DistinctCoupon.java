package com.bridgelabz.bootcampJava.day12;

import java.util.Scanner;

import com.bridgelabz.bootcampJava.util.Utility;
public class DistinctCoupon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("enter number for generate coupons");
		int range = scanner.nextInt();
		int count=utility.distinctCoupon(range);
		System.out.println(count + " N times loop runs for finding distinct");
		scanner.close();

	}

}