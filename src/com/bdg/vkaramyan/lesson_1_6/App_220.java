
package com.bdg.vkaramyan.lesson_1_6;

public class App_220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		int[] numbers = { 1, 3, 5, 8, -4, 9, 7, -11, 13, -2 };
		int count_positive = 0;
		int count_negative = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				count_positive++;

			}
		}
		System.out.println("Count of positive numbers is:" + count_positive);

		for (int k = 0; k < numbers.length; k++) {
			if (numbers[k] < 0) {
				count_negative++;
			}
		}

		System.out.println("Count of negative numbers is:" + count_negative);
	}

}
