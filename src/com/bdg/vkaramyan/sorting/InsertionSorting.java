package com.bdg.vkaramyan.sorting;

import java.util.Arrays;

public class InsertionSorting {
	
	public static void main(String[] args) {
		
		int [] arr = {10, 3, 4, 5, 8, 9, 6};
		
		arr = insertionSort(arr, arr.length);
		System.out.println("Array after sorting:" + " " + Arrays.toString(arr));
	}
	
	private static int [] insertionSort(int [] arr, int n) {
		
		for (int i = 1; i < n ; i++) {
			for (int j = i; j > 0 && j <= i; j--) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println("Insertion sorting is:" + i + " " + Arrays.toString(arr));
		}
		
		return arr;
		
	}

}
