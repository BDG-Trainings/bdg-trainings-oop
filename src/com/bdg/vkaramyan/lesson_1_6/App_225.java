package com.bdg.vkaramyan.lesson_1_6;

public class App_225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 1, 5, 8, 6, 4, 7, 9, 2, 3 };
		int t = 4;
		int multiply = 1;

		for (int i = 0; i < numbers.length; i++) {
			if (Math.abs(numbers[i]) < t) {
				multiply *= numbers[i];
			}
		}
		System.out.println("Multiply of abs numbers is:" + multiply);

	}

}
