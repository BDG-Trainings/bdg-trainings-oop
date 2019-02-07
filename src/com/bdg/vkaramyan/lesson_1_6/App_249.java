package com.bdg.vkaramyan.lesson_1_6;

public class App_249 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 15, -1, 3, 4, 10, 13, 43, 9, 6 };
		int count = 0;
		int k = 3;

		for (int i = 0; i < numbers.length; i++) {
			if (Math.abs(numbers[i] - i) > k) {
				count++;
			}
		}
		System.out.println("Result:" + count);

	}

}
