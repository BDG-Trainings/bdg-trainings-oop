package com.bdg.vkaramyan.lesson_1_6;

public class App_259 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 10, 3, -1, 3, 4, 17, 13, 8, 9, 6 };
		int min = numbers[0];
		int num = 0;

		for (int i = 1; i < numbers.length; i++) {

			if (min > numbers[i]) {
				min = numbers[i];
				num = i;
			}
		}
		System.out.println("Result:" + num);

	}

}
