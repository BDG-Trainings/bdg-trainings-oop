package com.bdg.vkaramyan.lesson_1_6;

public class App_245 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 55, -1, 3, 4, -76, 13, 43, 9, 6 };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if ((numbers[i] + i) % 3 == 0) {
				sum += Math.pow(numbers[i], 2);
			}
		}
		System.out.println("Result:" + sum);

	}

}
