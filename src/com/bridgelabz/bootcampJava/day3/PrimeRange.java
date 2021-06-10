package com.bridgelabz.bootcampJava.day3;
import java.util.Scanner;

import com.bridgelabz.bootcampJava.util.Utility;
 
/* Java program to find the prime numbers
* between a given Number
*/
public class PrimeRange
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		Utility.range(end, start);
		
	}
}