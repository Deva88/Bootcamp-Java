package com.bridgelabz.bootcampJava.day3;

import java.util.Scanner;

import com.bridgelabz.bootcampJava.util.Utility;

public class RollDie {
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter the range to roll a dice :");
    	int range=sc.nextInt();
    	Utility.dice(range);
  }
}  	