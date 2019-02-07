package com.bdg.vkaramyan.lesson_1_6;

public class App_228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 0, 5, 8, 6, 4, 7, 9, 2, 3 };
		int sum = 0;
		int k = 3;

		for (int i = 0; i < numbers.length; i++) {
			if (i % k == 0) {
				sum += numbers[i];

			}
		}
		System.out.println("Sum of indexes is:" + sum);

	}

}
