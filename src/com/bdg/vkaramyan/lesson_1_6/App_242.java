package com.bdg.vkaramyan.lesson_1_6;

public class App_242 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 55, -1, 3, 4, -76, 13, 43, 9, 6 };
		int multiply = 1;
		int m = 3;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % m == 0) {
				multiply *= numbers[i];
			}
		}
		System.out.println("Result:" + multiply);

	}

}
