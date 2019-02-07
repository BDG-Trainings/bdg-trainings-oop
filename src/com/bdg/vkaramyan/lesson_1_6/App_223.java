package com.bdg.vkaramyan.lesson_1_6;

public class App_223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 0, -5, 8, 6, -4, 7, 9, 2, 3 };
		int[] range = { 0, 10 };
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= range[0] && numbers[i] <= range[1]) {
				count++;

			}
		}
		System.out.println(count);
	}

}
