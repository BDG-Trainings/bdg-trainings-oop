package com.bdg.vkaramyan.lesson_1_6;

public class App_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 2589;
		int y;

		int miavor = number / 1000;
		System.out.println("Miavor : " + miavor);

		int tasnavor = (number / 100) % 10;
		System.out.println("Tasnavor : " + tasnavor);

		int haryuravor = (number / 10) % 10;
		System.out.println("Haryuravor : " + haryuravor);

		int hazaravor = number % 10;
		System.out.println("Hazaravor : " + hazaravor);

		if ((miavor * tasnavor * haryuravor * hazaravor) > 200) {
			y = 0;
			System.out.println(y);
		} else {
			y = 1;
			System.out.println(y);
		}

	}

}
