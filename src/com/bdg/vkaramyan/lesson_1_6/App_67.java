package com.bdg.vkaramyan.lesson_1_6;

public class App_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5612;

		int miavor = number / 1000;
		System.out.println("Miavor : " + miavor);

		int tasnavor = (number / 100) % 10;
		System.out.println("Tasnavor : " + tasnavor);

		int haryuravor = (number / 10) % 10;
		System.out.println("Haryuravor : " + haryuravor);

		int hazaravor = number % 10;
		System.out.println("Hazaravor : " + hazaravor);

		if (number == Math.sqrt(miavor + tasnavor + haryuravor + hazaravor)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
