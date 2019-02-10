package com.bdg.vkaramyan.lesson_1_6;

public class App_270 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] X = { 1, 3, 6, 10 };
		int[] Y = { 2, 5, 9, 8 };
		int sumX = 0;
		int sumY = 0;

		for (int i = 0; i < X.length && i < Y.length; i++) {
			sumX += Math.pow(X[i], 2);
			sumY += Math.pow(Y[i], 2);

		}

		System.out.println("Result:" + (sumX + sumY));

	}

}
