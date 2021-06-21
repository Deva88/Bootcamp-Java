package com.bridgelabz.bootcampJava.util;

public class SortingSearch {
		
	/*
	 * Purpose: method for printing integer array 
	 * @param arr array from user
	 */
	public static void printIntArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Purpose: method for bubble sort
	 * @param arr array from user
	 * @return returns sorted array
	 */
	public static int[] intBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	/**
	 * Purpose: merge sort method for dividing
	 */
	public void mergeSort(String[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}

	}
	/**
	 * Purpose: method for compare the value and conquer the array
	 * @param arr   input from mergeSort method
	 * @param start input from mergeSort method
	 * @param mid   input from mergeSort method
	 * @param end   input from mergeSort method
	 */
	private void merge(String[] arr, int start, int mid, int end) {
		int p = start, q = mid + 1;
		String[] newArr = new String[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++) {
			if (p > mid)
				newArr[j++] = arr[q++];
			else if (q > end)
				newArr[j++] = arr[p++];
			else if (arr[p].compareTo(arr[q]) < 0)
				newArr[j++] = arr[p++];
			else
				newArr[j++] = arr[q++];
		}
		for (int k = 0; k < j; k++) {
			arr[start++] = newArr[k];
		}
	}
	/**
	 * Purpose: method for printing String array
	 */
	public static void printStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	/**
	 * Purpose: method for insertion sort
	 * 
	 * Identifier: P4CallUtility, P7InsertionSort
	 * 
	 * @param arr array from user
	 * @return returns sorted array
	 */
	public static int[] intInsertionSort(int[] arr) {
		/*
		 * 12, 11, 13, 5, 6
		 * 
		 * 11, 12, 13, 5, 6
		 * 
		 * 11, 12, 13, 5, 6
		 * 
		 * 5, 11, 12, 13, 6
		 * 
		 */

		int key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
}
