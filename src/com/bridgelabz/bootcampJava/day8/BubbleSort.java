package com.bridgelabz.bootcampJava.day8;
import com.bridgelabz.bootcampJava.util.SortingSearch;

public class BubbleSort {
	public static void main(String[] args) {
		int[] intArr = { 1, 5, 2, 6, 7, 9, 3 };
		System.out.println("Before sorting");
		SortingSearch.printIntArr(intArr);
		SortingSearch.intBubbleSort(intArr);
		System.out.println("After sorting");
		SortingSearch.printIntArr(intArr);
	}
}
