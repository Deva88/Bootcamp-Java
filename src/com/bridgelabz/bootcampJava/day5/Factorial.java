package com.bridgelabz.bootcampJava.day5;
import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.MathFunction;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();
		MathFunction.fact(number);
	}
}