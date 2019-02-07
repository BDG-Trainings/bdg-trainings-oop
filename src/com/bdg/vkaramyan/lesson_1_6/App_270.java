package com.bdg.vkaramyan.lesson_1_6;

public class App_270 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] X = { 1, 3, 6, 10 };
		int[] Y = { 2, 5, 9, 8 };
		int sum_X = 0;
		int sum_Y = 0;

		for (int i = 0; i < X.length && i < Y.length; i++) {
			sum_X += Math.pow(X[i], 2);
			sum_Y += Math.pow(Y[i], 2);

		}

		System.out.println("Result:" + (sum_X + sum_Y));

	}

}
