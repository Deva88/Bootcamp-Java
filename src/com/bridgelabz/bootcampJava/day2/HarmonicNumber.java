package com.bridgelabz.bootcampJava.day2;

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;
public class HarmonicNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n for Harmonic Series");
		int num=scanner.nextInt();
		System.out.print("H" +num+ " = ");
		
		Utility.harmonicSeries(num);
	}
	
}