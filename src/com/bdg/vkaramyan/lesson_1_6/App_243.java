package com.bdg.vkaramyan.lesson_1_6;

public class App_243 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 55, -1, 3, 4, 15, 13, 43, 25, 5 };
		int count = 0;
		int t = 5;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % t == 0) {
				count++;
			}
		}
		System.out.println("Result:" + count);

	}

}
