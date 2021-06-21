package com.bridgelabz.bootcampJava.day7;

public class StandardDeviation {
    public static void main(String[] args) {
        double[] numArray = { 10, 20, 30, 40, 50, 60, 40, 30, 20, 10 };
        double SD = calculateSD(numArray);
        System.out.format("Standard Deviation = %.6f", SD);
    }
    public static double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }
        double mean = sum/length;
        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
    }
}