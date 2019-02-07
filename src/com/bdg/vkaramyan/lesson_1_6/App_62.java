package com.bdg.vkaramyan.lesson_1_6;

public class App_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5612;

		int miavor = number / 1000;
		int tasnavor = (number / 100) % 10;
		int haryuravor = (number / 10) % 10;
		int hazaravor = number % 10;

		if (number < 5000) {
			System.out.println(number / (miavor + haryuravor));
		} else {
			System.out.println(number / (hazaravor + tasnavor));
		}
	}

}
