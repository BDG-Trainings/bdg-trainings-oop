package com.bdg.vkaramyan.lesson_1_6;

public class App_264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] X = { -5, -1, 3, 6, -10, -3 };
		int[] Y = { 2, 5, -13, 9, -8, -15 };
		int count_X = 0;
		int count_Y = 0;

		for (int i = 0; i < X.length && i < Y.length; i++) {
			if (X[i] < 0) {
				count_X++;
			}

			if (Y[i] < 0) {
				count_Y++;

			}

		}

		System.out.println("Result:" + count_X);
		System.out.println("Result:" + count_Y);

	}

}
