package com.bdg.vkaramyan.lesson_1_6;

public class App_212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arraySize = 10;
		int[] array = new int[arraySize];
		int[] numbers = { 10, -5, 3, 8, 4, -3, 9, 6, 15, 7 };

		int i = 0;
		int sum = 0;
		int count = 0;

		while (i < arraySize) {
			if (numbers[i] > 0) {
				sum += Math.pow(numbers[i], 2);
				count = count + 1;
			}
			i = i + 1;
		}
		System.out.println("Average:" + Math.sqrt(sum / count));
	}

}
