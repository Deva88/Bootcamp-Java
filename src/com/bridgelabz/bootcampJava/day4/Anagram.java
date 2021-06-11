package com.bridgelabz.bootcampJava.day4;

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;

public class Anagram {

	public static void main(String[] args) {
		String str1, str2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter string 1");
		str1=scanner.next();
		System.out.println("enter string 2");
		str2=scanner.next();
		Utility utility = new Utility();
		boolean isAnagram=utility.isAnagram(str1,str2);
		if(isAnagram) {
			System.out.println("Two String are anagram");
		}else {
			System.out.println("Two String are not anagram");
		}
		scanner.close();
	}

}