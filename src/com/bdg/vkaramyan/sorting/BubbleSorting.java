package com.bdg.vkaramyan.sorting;

import java.util.Arrays;

public class BubbleSorting {
	
public static void main(String[] args) {
		
		int [] arr = {10, 3, 4, 5, 8, 9, 6};
		
		arr = bubbleSort(arr, arr.length);
			System.out.println("Array after sorting:" + " " + Arrays.toString(arr));
	}
	
	private static int [] bubbleSort(int [] arr, int n) {
		
		for(int i = 0; i < n-1; i++) {
			for(int k = 0; k < n-1; k++) {
				if(arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
			
			System.out.println("Bubble sorting is:" + " " + Arrays.toString(arr));
		}
		return arr;
		
	}

}
