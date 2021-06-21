package com.bridgelabz.bootcampJava.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Utility {

	//Day-1
	public static void mathOpt(int a, int b, int c) {
		//int a=10, b=20, c=30;
		int operation1= a + b * c;
		int operation2= a * b + c;
		int operation3= c + a / b;
		int operation4= a % b + c;

		System.out.println("Operation one (a + b * c): "+operation1);
		System.out.println("Operation two (a * b + c): "+operation2);
		System.out.println("Operation Three (c + a / b): "+operation3);
		System.out.println("Operation Four (a % b + c): "+operation4);	
	}


	/**
	 * Purpose: method for finding year is leap or not
	 * 
	 * Identifier: P3LeapYear
	 * 
	 * @param year input taken from user
	 */

	public static void isLeapYear(int year) {
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			System.out.println("Given year is Leap Year");
		} else {
			System.out.println("Given year is Not Leap Year...!");
		}

	}


	public static void monthDay(int month, int day) {
		boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
				|| (month == 4 && day >=  1 && day <= 30)
				|| (month == 5 && day >=  1 && day <= 31)
				|| (month == 6 && day >=  1 && day <= 20);

		System.out.println(isSpring);
	}

	public static void dice() {
		int a = 1 + (int) (Math.random() * 6);
		int b = 1 + (int) (Math.random() * 6);
		int sum = a + b;

		System.out.println("First of Dice :: " +a);
		System.out.println("Second of Dice :: " +b);
		System.out.println("Sum of two Dice :: " +sum);
	}

	public double EuclideanDistance(int x1, int y1, int x2, int y2) {
		double distance, powerofx, powerofy, sumOfPowerXY;
		int x, y;
		x = x2 - x1;
		y = y2 - y1;
		powerofx = Math.pow(x, 2);
		powerofy = Math.pow(y, 2);
		sumOfPowerXY = powerofx + powerofy;
		distance = Math.sqrt(sumOfPowerXY);
		return distance;
	}

	/*
	 * Purpose: Method is written for finding delta for Quadratic Equation
	 * @return delta finding delta using formula
	 */
	public double FindDelta(int a, int b, int c) {
		int delta = (b * b) - (4 * a * c);
		return delta;
	}

	/*
	 * Purpose: Method is written for finding first Quadratic Equation
	 * @param delta delta of a b and c
	 * @return returns of quadratic equation answer
	 */
	public double QuadraticEquation1(int a, int b, double delta) {
		double absDelta = Math.abs(delta);
		double sqrtDelta = Math.sqrt(absDelta);
		double equation1 = (-b + sqrtDelta) / (2 * a);
		return equation1;
	}

	/*
	 * Purpose: Method is written for finding second Quadratic Equation
	 * @param delta delta of a b and c
	 * @return returns of quadratic equation answer
	 */
	public double QuadraticEquation2(int a, int b, double delta) {
		double absDelta = Math.abs(delta);
		double sqrtDelta = Math.sqrt(absDelta);
		double equation2 = (-b - sqrtDelta) / (2 * a);
		return equation2;
	}



	//Day-2
	public static void randomMinMax(){
		int number = 5;
		double random1 = Math.random();
		double random2 = Math.random();
		double random3 = Math.random();
		double random4 = Math.random();
		double random5 = Math.random();

		System.out.println("Random value 1 :: " +random1);
		System.out.println("Random value 2 :: " +random2);
		System.out.println("Random value 3 :: " +random3);
		System.out.println("Random value 4 :: " +random4);
		System.out.println("Random value 5 :: " +random5);

		double min     = Math.min(random1, Math.min(random2, Math.min(random3, Math.min(random4, random5))));
		double max     = Math.max(random1, Math.max(random2, Math.max(random3, Math.max(random4, random5))));
		double average = (random1 + random2 + random3 + random4 + random5) / number;

		System.out.println("Average = " + average);
		System.out.println("Min     = " + min);
		System.out.println("Max     = " + max);
	}


	public static void powerOf(int n) {
		for(int i = 1; i<=n;i++) {
			System.out.println(Math.pow(2,i));
		}
	}


	public void flipCoin(int numberOfTimesFlipCount) {
		int percentageOfHeads, percentageOfTails;
		int headsCounts = 0, tailsCounts = 0;
		for (int i = 0; i < numberOfTimesFlipCount; i++) {
			if (Math.random() > 0.5) {
				headsCounts++;
			} else {
				tailsCounts++;
			}
		}
		System.out.println("heads : " + headsCounts);
		System.out.println("tails : " + tailsCounts);
		// calculation of percentage
		percentageOfHeads = headsCounts * 100 / numberOfTimesFlipCount;
		percentageOfTails = tailsCounts * 100 / numberOfTimesFlipCount;

		System.out.println("Percentage for heads : " + percentageOfHeads);
		System.out.println("Percentage for tails : " + percentageOfTails);
	}

	public static void harmonicSeries(int num) {
		for ( int count = 1 ; count<= num ; count++ ) {
			if(count == num) {
				System.out.print(" 1/" +count);
			}
			else
				System.out.print(" 1/" +count+ " + ");
		}
	}

	/*
	 * method for calculating wind chill
	 * temperature in celcius
	 * speed in velocity
	 * @return return the calculated windchill
	 */
	public double CalculateWindChill(double temperature, double windspeed) {
		double a, windChill, b, c;
		a = 0.6215 * temperature;
		b = 0.4275 * temperature;
		c = b - 35.75;
		windChill = 35.74 + a + c * (Math.pow(windspeed, 0.16));
		// windchill cannot be negative
		windChill = Math.abs(windChill);
		return windChill;
	}

	/**
	 * Method is written for Converting Temperature Fahrenheit to Celsius
	 * temperatureInFerenheit
	 * temperatureInCelcius return temperature in celsius
	 */
	public double FahrenheitToCelsius(double temperatureInFerenheit) {
		double temperatureInCelcius;
		temperatureInCelcius = ((temperatureInFerenheit - 32) * 5) / 9;
		return temperatureInCelcius;
	}

	/*
	 * Method is written for Converting Temperature Celcius to Fahrenheit 
	 * temperatureInCelsius
	 * temperatureInFahrenheit return temperature in fahrenheit
	 */
	public double CelsiusToFahrenheit(double temperatureInCelsius) {
		double temperatureInFahrenheit;
		temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
		return temperatureInFahrenheit;
	}

	/*
	 * Method is written for Find Sin and cos value
	 */
	public static void SinCos(double degrees) {
		double radians = Math.toRadians(degrees);
		double sinValue = Math.sin(radians);
		double cosValue = Math.cos(radians);
		
		System.out.println();
		System.out.println("sin(" +degrees+ ") =" +sinValue);
		System.out.println("cos(" +degrees+ ") =" +cosValue);
	}

	/*
	 * To Calculate Day Of a Week
	 * day   input taken from user
	 * month input taken from user
	 * year  input taken from user
	 * @return dayOfWeek return day for week like Monday Tuesday
	 */
	public int calculateDayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	/*
	 * Purpose: method for finding square root using newton's law
	 * c input from user
	 * returns the square root
	 */
	public double findSquareRootUsingNewtonsMethod(int c) {
		double t, epsilon;
		t = c;  // estimate of the square root of c
		epsilon = 1e-15; // relative error tolerance
		// repeatedly apply Newton update step until desired precision is achieved
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}

	/*
	 * method for gambling simulation
	 * stake input from user
	 * goal  input from user
	 * times input from user
	 */
	public void gamlingSimulation(int stake, int goal, int times) {
		int tempStake = stake;
		int tempTime = times;
		int bets = 0;
		int win = 0, lose = 0;

		while (tempStake != 0 && tempStake != goal) {
			if (tempTime > -1) {
				if (tempStake != 0) {
					if (win != goal) {
						if (Math.random() > 0.5) {
							tempStake++;
							win++;
							System.out.println("Won" + tempStake);
						} else {
							tempStake--;
							lose++;
							System.out.println("Loss" + tempStake);
						}
					} else {
						System.out.println("Gamler reached to goal now withdraw money");
						break;
					}

				} else {
					System.out.println("Stake amount is 0 not able to play now");

				}

			} else {
				System.out.println("Played n times");
				break;
			}
			tempTime--;
			bets++;

		}
		int perOfWin = win * 100 / bets;
		int perOfLose = lose * 100 / bets;

		System.out.println("Percentage of win : " + perOfWin);
		System.out.println("Percentage of loose : " + perOfLose);
	}


	/* Die Roll n times and suggest which
	 *  number between 1 and 6 fall maximum number of times. 
	 */

	public static void dice(int n) {
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;

		while(n>0) {
			int random = (int) (Math.random() * 6) + 1;
			if(random ==1) {
				count1++;
				n--;
			}
			else if(random ==2) {
				count2++;
				n--;
			}
			else if(random ==3) {
				count3++;
				n--;
			}
			else if(random ==4) {
				count4++;
				n--;
			}
			else if(random ==5) {
				count5++;
				n--;
			}
			else {
				count6++;
				n--;
			}
		}
		if(count1>count2 && count1>count3 && count1>count4 && count1>count5 && count1>count6)
			System.out.println("1 comes minmum time and occurence is " +count1);
		else if(count2>count3 && count2>count4 && count2>count5 && count2>count6)
			System.out.println("2 comes minmum time and occurence is " +count2);
		else if( count3>count4 && count3>count5 && count3>count6)
			System.out.println("3 comes minmum time and occurence is " +count3);
		else if(count4>count5 && count4>count6)
			System.out.println("4 comes minmum time and occurence is " +count4);
		else if(count5>count6)
			System.out.println("5 comes minmum time and occurence is " +count5);
		else 
			System.out.println("6 comes minmum time and occurence is " +count6);
	}


	/* Java program to find the prime numbers
	 * between a given Range Number
	 */
	public static void range(int end, int start) {
		int count;
		//loop for finding and printing all prime numbers between given range
		for(int i = start ; i <= end ; i++)
		{
			//logic for checking number is prime or not
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
	}

	/**
	 * method for checking year is leap or not 
	 * year input from user
	 * returns true if leap year else false
	 */
	public static boolean is_LeapYear(int year) {
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}


	
	public static int calculateDay_Of_Week(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}





	/**
	 * print calendar on console using two dimension array
	 * day of the week
	 * days of the month
	 */
	public static void printCalendar(int day, int days) {

		String[][] cal = new String[6][7];
		int temp;
		String weekdaystr = "SUN MON TUE WED THU FRI SAT";
		System.out.println(weekdaystr);
		switch (day) {
		case 0:
			temp = 1;
			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (temp <= 9) {
						cal[i][j] = temp + "   ";
					} else {
						cal[i][j] = temp + "  ";
					}
					temp++;
					if (temp == days + 1) {
						break;
					}
				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 1:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j == 0) {
						cal[i][j] = "    ";
					} else {
						if (i <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}

			}
			break;
		case 2:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j == 0 || i == 0 && j == 1) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}

			}
			break;
		case 3:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j >= 0 || i == 0 && j <= 2) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 4:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j >= 0 || i == 0 && j <= 3) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 5:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j >= 0 || i == 0 && j <= 4) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 6:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j >= 0 || i == 0 && j <= 5) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		}
		for (int i = 0; i < cal.length; i++) {
			for (int j = 0; j < cal[i].length; j++) {
				if (cal[i][j] == null)
					break;
				System.out.print(cal[i][j]);
			}
			if (cal[i] == null)
				break;
			System.out.println();
		}
	}


	/**
	 * method for finding two string are anagram or not
	 * str1 input from user
	 * str2 input from user
	 * true or false depending upon anagram or not
	 */
	public boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}	
	
	/*
	 * Purpose: for replacing the regular expression into string given by user
	 * @param input taken from user
	 * @return replaced string will return
	 */
	public String regexUsername(String input) {
		String username = "<<username>>";
		return username.replaceAll("<<username>>", input);
	}

}


