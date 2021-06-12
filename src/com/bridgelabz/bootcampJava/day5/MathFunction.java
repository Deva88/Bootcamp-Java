package com.bridgelabz.bootcampJava.day5;

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;
public class MathFunction {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		//return an harmonic number
		System.out.println("Enter n for Harmonic Series");
		int num=scanner.nextInt();
		System.out.print("H" +num+ " = ");
		Utility.harmonicSeries(num);
		
		//return a sin of an angle
		System.out.println(" ");
		System.out.println("Enter Sin Angle : ");
		double degrees=scanner.nextInt();
		Utility.isSin(degrees);
		
		
		
	}
	
}