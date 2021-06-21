package com.bridgelabz.bootcampJava.day6;

import java.util.Random;
public class RandomArray {
	public static void main(String[] args) {
		Integer[] val1 = new Integer[1];
		Integer[] val2 = new Integer[1];
		Integer[] val3 = new Integer[1];
		Integer[] val4 = new Integer[1];
		Integer[] val5 = new Integer[1];
		int sum1=0, sum2=0, sum3=0, sum4=0, sum5=0;
		
		System.out.print("Random number array First => ");
		for (int i = 0; i < val1.length; i++) {
			val1[i] = new Random().nextInt(1000);
			System.out.print(val1[i] + " ");
		}
		
		System.out.println(" ");
		System.out.print("Random number array Second => ");
		for (int i = 0; i < val2.length; i++) {
			val2[i] = new Random().nextInt(1000);
			System.out.print(val2[i] + " ");
		}
		
		System.out.println(" ");
		System.out.print("Random number array Third => ");
		for (int i = 0; i < val3.length; i++) {
			val3[i] = new Random().nextInt(1000);
			System.out.print(val3[i] + " ");
		}
		
		System.out.println(" ");
		System.out.print("Random number array Fourth => ");
		for (int i = 0; i < val4.length; i++) {
			val4[i] = new Random().nextInt(1000);
			System.out.print(val4[i] + " ");
		}
		
		System.out.println(" ");
		System.out.print("Random number array Fifth => ");
		for (int i = 0; i < val5.length; i++) {
			val5[i] = new Random().nextInt(1000);
			System.out.print(val5[i] + " ");
		}
	
		
		System.out.println();
		for (int i = 0; i < val1.length; i++) {
			sum1 = sum1 + val1[i];
		}
		System.out.println("sum of First Array  => " + sum1);
		
		
		System.out.println();
		for (int i = 0; i < val2.length; i++) {
			sum2 = sum2 + val2[i];
		}
		System.out.println("sum of second Array => " + sum2);
		
		
		System.out.println();
		for (int i = 0; i < val3.length; i++) {
			sum3 = sum3 + val3[i];
		}
		System.out.println("sum of Third Array  => " + sum3);

		
		System.out.println();
		for (int i = 0; i < val4.length; i++) {
			sum4 = sum4 + val4[i];
		}
		System.out.println("sum of Fourth Array  => " + sum4);

		System.out.println();
		for (int i = 0; i < val5.length; i++) {
			sum5 = sum5 + val5[i];
		}
		System.out.println("sum of Fifth Array   => " + sum5);	
	}
 }