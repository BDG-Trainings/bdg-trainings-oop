package com.bdg.vkaramyan.lesson_1_6;

public class App_226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 1, 5, 8, 6, 4, 7, 9, 2, 3 };
		int k = 10;
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (Math.abs(numbers[i]) < k) {
				count++;
			}
		}
		System.out.println("Count of abs numbers is:" + count);

	}

}
