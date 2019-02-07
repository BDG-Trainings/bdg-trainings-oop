package com.bdg.vkaramyan.lesson_1_6;

public class App_233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 55, -1, 3, 4, -76, 13, 43, -86, 7 };
		int sum = 0;
		int multiply = 1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
				multiply *= numbers[i];
			}
		}
		System.out.println("Result is:" + sum);
		System.out.println("Result is:" + multiply);

	}

}
