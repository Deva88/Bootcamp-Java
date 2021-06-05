package com.bridgelabz.bootcampJava.day1;

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;

/*
Write a IntOpt.java program by taking a, b and c as input values and print the
following integer operations 
a + b *c            a * b + c 
c + a / b           a % b + c.
also understand the precedence of the operators.
*/

public class IntOpt {

	public static void main(String[] args) {
		int a, b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vale : ");
		a = sc.nextInt();
		System.out.println("Enter b value : ");
		b=sc.nextInt();
		System.out.println("Enter c value : ");
		c=sc.nextInt();
		
		Utility.mathOpt(a, b, c);
		
		
	}
}