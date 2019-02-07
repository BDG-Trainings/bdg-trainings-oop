package com.bdg.vkaramyan.lesson_1_6;

public class App_244 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 12, -1, 3, 4, 22, 13, 43, 9, 6 };
		int multiply = 1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 5 == 2) {
				multiply *= numbers[i];
			}
		}
		System.out.println("Result:" + multiply);

	}

}
