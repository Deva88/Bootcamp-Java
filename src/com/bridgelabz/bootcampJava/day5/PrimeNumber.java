package com.bridgelabz.bootcampJava.day5;

import com.bridgelabz.bootcampJava.util.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (Utility.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}