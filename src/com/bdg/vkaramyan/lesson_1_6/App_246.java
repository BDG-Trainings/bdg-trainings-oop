package com.bdg.vkaramyan.lesson_1_6;

public class App_246 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 0, -1, 3, 4, 5, 13, 8, 9, 6 };
		int sum = 0;
		int count = 0;
		int n = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (Math.pow(n, 2) == i) {
				sum += numbers[i];
				count++;
			}
		}
		System.out.println("Result:" + sum / count);

	}

}
