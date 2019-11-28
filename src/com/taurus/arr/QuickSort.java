package com.taurus.arr;

/**
 * 
 * @author Taurus   обнГ8:41:13
 *
 */
public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int index = getIndex(arr, low, high);
			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}
	}

	private static int getIndex(int[] arr, int low, int high) {
		int data = arr[low];
		while (low < high) {
			while (low < high && arr[high] >= data) {
				high--;
			}
			arr[low] = arr[high];
			while (low < high && arr[low] <= data) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = data;
		return low;
	}
}
