package com.bdg.vkaramyan.lesson_1_6;

public class App_266 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] X = { 5, 1, 3, 6, 10, 3 };
		int[] Y = { 2, 5, 1, 4, 3, 5 };
		int sumX = 0;
		int sumY = 0;

		for (int i = 0; i < X.length && i < Y.length; i++) {
			if (X[i] % 2 == 1) {
				sumX += X[i];
			}

			if (Y[i] % 2 == 0) {
				sumY += Y[i];
			}
		}
		
		System.out.println("Result:" + " " + (sumX - sumY));
	}
}
