package com.bridgelabz.bootcampJava.day1;

/* 	Write a program “PrintThreeNames.java” that takes three names as input and
prints out a proper sentence with the names in the reverse of the order given, so
that for example, "java PrintThreeNames Alice Bob Carol" gives "Hi Carol, Bob,
and Alice.".
*/

import java.util.Scanner;
public class PrintthreeNames{

	    public static void main(String[] args) {
	    	String name;
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name : ");
			name = sc.next();
			
	        System.out.print("Hi, " +name+ " " );
	        System.out.println(". How are you?");
	    }
	}

