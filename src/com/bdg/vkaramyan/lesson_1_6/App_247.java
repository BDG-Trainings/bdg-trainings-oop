package com.bdg.vkaramyan.lesson_1_6;

public class App_247 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 2, -1, 3, 4, -10, 13, 43, 9, 6 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > i) {
				sum += Math.pow(numbers[i], 2);
				count++;
			}
		}
		System.out.println("Result:" + Math.sqrt(sum / count));

	}

}
