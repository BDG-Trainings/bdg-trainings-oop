package com.bdg.vkaramyan.lesson_1_6;

public class App_248 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 55, -1, 3, 4, -76, 13, 43, 9, 6 };
		int sum = 0;
		int k = 2;

		for (int i = 0; i < numbers.length; i++) {
			if (Math.pow((numbers[i] + i), 2) % k == 0) {
				sum += numbers[i];
			}
		}
		System.out.println("Result:" + sum);

	}

}
