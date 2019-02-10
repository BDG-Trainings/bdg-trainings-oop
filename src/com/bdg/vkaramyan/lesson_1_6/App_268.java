package com.bdg.vkaramyan.lesson_1_6;

public class App_268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] X = { 21, 7, 3, 35, 10, 3 };
		int[] Y = { 2, 5, 7, 4, 14, 28 };
		int k = 2;
		int countX = 0;
		int countY = 0;
		int total = 0;

		for (int i = 0; i < X.length; i++) {
			if (X[i] % k == 0) {
				countX++;
			}
			if (Y[i] % k == 0) {
				countY++;

			}
			
			total = countX + countY;
		}
		System.out.println("Result:" + " " + total);
	}

}
