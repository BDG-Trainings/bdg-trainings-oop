package com.bdg.vkaramyan.lesson_1_6;

public class App_218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int[] numbers = { 1, 3, 5, 8, -4, 9, 7, 11, 13, 2 };

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (numbers[i] % 2 == 1) {
				sum += Math.abs(numbers[i]);
			}
		}
		System.out.println("Sum of absolute numbers is: " + sum);
	}

}
