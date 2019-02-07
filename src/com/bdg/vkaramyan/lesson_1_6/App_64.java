package com.bdg.vkaramyan.lesson_1_6;

public class App_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5000;

		int miavor = number / 1000;
		int tasnavor = (number / 100) % 10;
		char y;

		if (miavor + tasnavor == 5) {
			y = 's';
			System.out.println(y);
		} else {
			y = 'd';
			System.out.println(y);
		}
	}

}
