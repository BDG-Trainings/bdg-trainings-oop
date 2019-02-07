package com.bdg.vkaramyan.lesson_1_6;

public class App_215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize = 10;
		int[] array = new int[arraySize];
		int[] numbers = { 2, 5, 4, 8, 6, 3, 12, 2, 14, 7 };

		int sum = 0;

		for (int i = 0; i < arraySize; i++) {
			if (numbers[i] % 2 == 0) {
				sum = sum + numbers[i];
			}
		}
		System.out.println("Sum of elements: " + sum);
	}

}
