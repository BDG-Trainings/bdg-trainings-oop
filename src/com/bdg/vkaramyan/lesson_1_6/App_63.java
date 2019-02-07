package com.bdg.vkaramyan.lesson_1_6;

public class App_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4581;

		int miavor = number / 1000;
		int tasnavor = (number / 100) % 10;
		int haryuravor = (number / 10) % 10;
		int hazaravor = number % 10;

		if (miavor == 1 || tasnavor == 1 || haryuravor == 1 || hazaravor == 1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
