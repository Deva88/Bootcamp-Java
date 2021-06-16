package com.bridgelabz.bootcampJava.day5;

import java.util.Scanner;

import com.bridgelabz.bootcampJava.util.MathFunction;
 class WeekOne {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		//return an harmonic number
		System.out.println("Enter n for Harmonic Series");
		int num=scanner.nextInt();
		System.out.print("H" +num+ " = ");
		MathFunction.harmonicSeries(num);
		
		//return a sin of an angle
		System.out.println(" ");
		System.out.print("Enter Sin Angle : ");
		double degreesSin=scanner.nextInt();
		MathFunction.isSin(degreesSin);
		
		//return a Cos of an angle
		System.out.println(" ");
		System.out.print("Enter Cos Angle : ");
		double degreesCos=scanner.nextInt();
		MathFunction.isCos(degreesCos);
		
		//To return Binary of a number
		System.out.println(" ");
		System.out.println("Enter the Decimal Number :");
		int number= scanner.nextInt();
		String bin=" ";
		do {
			int rem =number % 2;
			bin=rem + bin;
			number = number / 2;
		}while(number!=0);
		System.out.println("Binary Number is : " +bin);
	
	}
		
	}
	
