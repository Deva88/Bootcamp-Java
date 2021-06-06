package com.bridgelabz.bootcampJava.day2;

import java.util.Scanner;

import com.bridgelabz.bootcampJava.util.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		Utility utility = new Utility();
		double temperatureInFerenheit, temperatureInCelcius;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Temperature in Ferenheit : ");
		temperatureInFerenheit = scanner.nextDouble();
		temperatureInCelcius = utility.FahrenheitToCelsius(temperatureInFerenheit);
		System.out.println("Fahrenheit to Celcius of " + temperatureInFerenheit + " is " + temperatureInCelcius);

		System.out.println("Enter Temperature in Celsius : ");
		temperatureInCelcius = scanner.nextDouble();
		temperatureInFerenheit = utility.CelsiusToFahrenheit(temperatureInCelcius);
		System.out.println("Celcius to Fahrenheit of " + temperatureInCelcius + " is " + temperatureInFerenheit);

		scanner.close();
	}

}
