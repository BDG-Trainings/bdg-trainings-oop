package com.bdg.vkaramyan.lesson_1_6;

public class App_267 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] X = { 21, 7, 3, 35, 10, 3 };
		int[] Y = { 2, 5, 7, 4, 14, 28 };
		int sumX = 0;
		int sumY = 0;
		
		for (int i = 0; i < X.length && i < Y.length; i++) {
			if (X[i] % 7 == 0) {
				sumX += X[i];
			}
			
			if (Y[i] % 7 == 0) {
				sumY += Y[i];
			}
		}
		System.out.println(sumX + sumY);
	}

}
