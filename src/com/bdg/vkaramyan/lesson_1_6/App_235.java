package com.bdg.vkaramyan.lesson_1_6;

public class App_235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 10, -5, 41, 25, 4, -3, 9, 6, 15, 7 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				sum += Math.pow(numbers[i], 2);
				count++;
			}
		}
		System.out.println("Result:" + Math.sqrt(sum / count));
	}

}
