package com.bdg.vkaramyan.sorting;

import java.util.Arrays;

public class SelectionSorting {
	
	public static void main(String[] args) {
		
		int [] arr = {10, 3, 4, 5, 8, 9, 6};
		
		arr = selectionSort(arr, arr.length);
			System.out.println("Array after sorting:" + " " + Arrays.toString(arr));
	}
	
	private static int [] selectionSort(int [] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for (int k = i + 1; k < n; k++) {
				if(arr[k] < arr[min]) {
					min = k;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println("Selection sorting is:" + " "+ i + " " + Arrays.toString(arr));
		}
		
		return arr;
	}
	
}
