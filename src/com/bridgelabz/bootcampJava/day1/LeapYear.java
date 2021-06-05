package com.bridgelabz.bootcampJava.day1;

/*
	Write a LeapYear.java program that takes a year as input and outputs the Year
    is a Leap Year or not a Leap Year.
*/

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;

public class LeapYear {
public static void main(String[] args){
	int year;
	System.out.println("Enter an Year : ");
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();

	Utility.leep(year);
}
}