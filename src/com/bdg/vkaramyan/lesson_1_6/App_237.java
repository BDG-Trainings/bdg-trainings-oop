package com.bdg.vkaramyan.lesson_1_6;

public class App_237 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 0, -1, 3, 4, -76, 13, 43, -86, 7 };
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0)
				count++;
		}
		System.out.println("Result:" + count);
	}

}
