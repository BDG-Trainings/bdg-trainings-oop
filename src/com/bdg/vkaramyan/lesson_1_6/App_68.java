package com.bdg.vkaramyan.lesson_1_6;

public class App_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5114;

		int miavor = number / 1000;
		int tasnavor = (number / 100) % 10;
		int haryuravor = (number / 10) % 10;

		if (miavor > tasnavor) {
			System.out.println(miavor * haryuravor);
		} else {
			System.out.println(1);
		}

	}

}
