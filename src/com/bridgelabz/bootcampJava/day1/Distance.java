package com.bridgelabz.bootcampJava.day1;

import java.util.Scanner;
import com.bridgelabz.bootcampJava.util.Utility;
public class Distance {

	public static void main(String[] args) {
		Utility utility = new Utility();

		int x1 = 0, y1 = 0;
		int x2, y2;

		double distance;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the value of x");
		x2 = scanner.nextInt();
		System.out.println("Please enter the value of y");
		y2 = scanner.nextInt();

		distance = utility.EuclideanDistance(x1, y1, x2, y2);

		System.out.println("Euclidean Distance of x and y from origin is: " + distance);
		scanner.close();
	}

}