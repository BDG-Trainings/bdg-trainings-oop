package com.bdg.vkaramyan.lesson_1_6;

public class App_216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize = 10;
		int[] array = new int[arraySize];
		int[] numbers = { 2, 5, 4, 8, 6, 3, 2, 2, 10, 7 };

		int sum = 1;

		for (int i = 0; i < arraySize; i++) {
			if (numbers[i] % 2 == 0) {
				sum = sum * numbers[i];
			}

		}
		System.out.println("Count of elements: " + sum);

	}

}
