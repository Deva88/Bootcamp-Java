package com.bridgelabz.bootcampJava.day11;

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;

public class SumOfThreeIsZero {
	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for elements");
		int count=scanner.nextInt();
		System.out.println("Enter elements");
		int[] arr=new int[count];
		for (int i = 0; i < count; i++) {
			arr[i]=scanner.nextInt();
		}
		utility.sumOfThreeIsZero(arr);
		scanner.close();
	}
}