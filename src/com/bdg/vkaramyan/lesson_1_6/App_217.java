package com.bdg.vkaramyan.lesson_1_6;

public class App_217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[12];
		int[] numbers = { 5, 7, 15, 9, 8, 2, 6, 12, 4, 4, 3, 1 };

		int sum = 1;
		for (int i = 0; i < array.length; i++) {
			if (numbers[i] % 2 == 1) {
				sum *= (Math.pow(numbers[i], 2));
			}

		}
		System.out.println("Sum of numbers: " + sum);

	}

}
