package com.bdg.vkaramyan.lesson_1_6;

public class App_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 3400;

		int miavor = number / 1000;
		int tasnavor = (number / 100) % 10;

		if (miavor * tasnavor == 12) {
			System.out.println("y=12");
		} else {
			System.out.println("y=0");
		}

	}

}
