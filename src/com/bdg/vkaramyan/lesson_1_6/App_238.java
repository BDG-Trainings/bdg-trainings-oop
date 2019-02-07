package com.bdg.vkaramyan.lesson_1_6;

public class App_238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 55, -1, 3, 4, -76, 13, 43, -86, 7 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				sum += numbers[i];
				count++;
			}
		}

		System.out.println("Result:" + sum / count);
	}

}
