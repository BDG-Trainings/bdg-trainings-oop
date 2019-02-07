package com.bdg.vkaramyan.lesson_1_6;

public class App_214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arraySize = 8;
		int[] array = new int[arraySize];
		int[] numbers = { 10, 13, -8, -1, 5, 4, -11, -3 };

		int i = 0;
		int sum = 0;
		int count = 0;

		for (int k = 0; k < arraySize; k++) {
			if (numbers[k] < 0) {
				sum = sum + numbers[k];
				count++;
			}
			i = i + 1;
		}
		System.out.println(sum / count);
	}

}
