package com.bridgelabz.bootcampJava.day8;
import com.bridgelabz.bootcampJava.util.SortingSearch;

public class MergeSort {
	public static void main(String[] args) {
		SortingSearch sortingsearch=new SortingSearch();
		String[] arr= {"deva","abhi","devendra","rock","ravi","lio"};
		int start=0,end=arr.length-1;
		sortingsearch.mergeSort(arr,start,end);
		SortingSearch.printStringArr(arr);

	}
}