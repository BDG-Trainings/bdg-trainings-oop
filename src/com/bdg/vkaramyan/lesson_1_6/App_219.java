package com.bdg.vkaramyan.lesson_1_6;

public class App_219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int[] numbers = { 1, 3, 5, 8, -4, 9, 7, 11, 13, 2 };
		int k = 1;
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % k == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
