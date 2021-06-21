package com.bridgelabz.bootcampJava.day9;
import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;

public class RegEx {
	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Name :");
		String input = scanner.next();
		if(input.length()<3) {
			System.out.println("Please enter valid username");
		}else {
			String output = utility.regexUsername(input);
			System.out.println("Username is + "+output);
		}
	}
}