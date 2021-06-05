package com.bridgelabz.bootcampJava.day1;
/*
	Write a program SpringSeason.java that takes two int values m and d from the
	command line and prints true if day d of month m is between March 20 (m = 3, d
	=20) and June 20 (m = 6, d = 20), false otherwise.
 */

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Month here : ");
		month = sc.nextInt();
		System.out.println("Enter an Date here : ");
		day=sc.nextInt();

		Utility.monthDay(month, day);
	}

}
