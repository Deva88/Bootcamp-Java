package com.bridgelabz.bootcampJava.day2;

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Power of Two : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		Utility.powerOf(n);
	}
}