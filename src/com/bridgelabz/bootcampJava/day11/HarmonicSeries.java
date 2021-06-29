package com.bridgelabz.bootcampJava.day11;

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;

public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("Enter n for Harmonic Series");
		int range=scanner.nextInt();
		utility.harmonic(range);	
		scanner.close();
	}
}