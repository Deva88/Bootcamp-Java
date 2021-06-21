package com.bridgelabz.bootcampJava.day8;
import com.bridgelabz.bootcampJava.util.SortingSearch;

public class InsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 1, 5, 2, 6, 7, 9, 3 };
		System.out.println("Before sorting");
		SortingSearch.printIntArr(intArr);
		SortingSearch.intInsertionSort(intArr);
		System.out.println("After sorting");
		SortingSearch.printIntArr(intArr);
		

	}

}