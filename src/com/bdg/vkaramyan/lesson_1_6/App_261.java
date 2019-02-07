package com.bdg.vkaramyan.lesson_1_6;

public class App_261 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] X = { 1, 3, 6, 10 };
		int[] Y = { 2, 5, 9, 8 };
		int sum1 = 0;
		int sum2 = 0;
		int count = 0;

		for (int i = 0; i < X.length && i < Y.length; i++) {
			sum1 += X[i];
			sum2 += Y[i];
			count++;
		}
		System.out.print("Result:" + ((sum1 / count) * (sum2 / count)));

	}

}
