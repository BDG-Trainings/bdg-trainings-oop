package com.bdg.vkaramyan.lesson_1_6;

public class App_224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 1, 5, 8, 6, 4, 7, 9, 2, 3 };
		int k = 3;
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (Math.abs(numbers[i]) < k) {
				sum += numbers[i];
			}
		}
		System.out.println("Cube of abs numbers is:" + Math.pow(sum, 3));
	}

}
