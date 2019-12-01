package com.taurus.arr;

/**
 * 
 * @author Taurus   下午11:09:54 冒泡
 * 
 * 外面层循环移动游标;内层循环遍历游标及之后(或之前)的元素
 *
 */
public class BubbleSort {
	
	public static void bubbleSort(int[] arr, int legth) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
