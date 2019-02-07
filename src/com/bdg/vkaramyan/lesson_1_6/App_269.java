package com.bdg.vkaramyan.lesson_1_6;

public class App_269 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] X = { 5, 1, 3, 6, 10, 3 };
		int[] Y = { 2, 5, 13, 9, 8, 15 };
		int sum_X = 0;
		int sum_Y = 0;

		for (int i = 0; i < X.length && i < Y.length; i++) {
			if (X[i] % 2 == 0) {
				sum_X += X[i];
			}

			if (Y[i] % 2 == 1) {
				sum_Y += Y[i];

			}

		}

		System.out.println("Result:" + (sum_X + sum_Y));

	}

}
