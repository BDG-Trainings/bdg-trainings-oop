package com.bdg.vkaramyan.lesson_1_6;

public class App_260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = { 10, 3, -1, 3, 4, 17, 13, 8, 9, 6 };
		int min = numbers[numbers.length-1];
		int num = numbers.length-1;

		for (int i = numbers.length-1; i < 0; i--) {

			if (min > numbers[i]) {
				min = numbers[i];
				num = i;
			}
		}
		System.out.println("Result:" + num);


	}

}
