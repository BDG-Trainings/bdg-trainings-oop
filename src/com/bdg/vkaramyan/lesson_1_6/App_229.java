package com.bdg.vkaramyan.lesson_1_6;

public class App_229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 0, 5, 8, 6, 4, 7, 9, 2, 3 };
		int multiply = 1;

		for (int i = 0; i < numbers.length; i++) {
			if ((numbers[i] - i) > 0) {
				multiply *= numbers[i];

			}
		}
		System.out.println("Multiply is:" + multiply);

	}

}
