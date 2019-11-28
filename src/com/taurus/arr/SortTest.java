package com.taurus.arr;

public class SortTest {
	
	public static void main(String[] args) {
		int[] arr  = {32, 321, 43, 3, 45, 543, 8756};
		QuickSort.quickSort(arr, 0, arr.length - 1);//¿ìÅÅ 
		for (int i : arr) {
			System.err.println(i);
		}
	}

}
