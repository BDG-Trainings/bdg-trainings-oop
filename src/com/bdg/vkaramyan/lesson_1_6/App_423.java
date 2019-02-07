package com.bdg.vkaramyan.lesson_1_6;

import java.util.Random;

public class App_423 {

	private final static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int m = 5;
		int number = 4;

		int array[][] = new int[m][m];
		int count = 0;
		int res = 0;

		for (int i = 0; i < m; i++) {
			for (int k = 0; k < m; k++) {
				array[i][k] = rand.nextInt(100);
			}
		}
		displayArray(array, m, m);

		System.out.println("-------");

		for (int i = 0; i < m; i++) {
			for (int k = 0; k <= i; k++) {
				if (i == k) {

					System.out.print(array[i][k] + ", ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < m; i++) {
			for (int k = 0; k < i; k++) {

				if (k <= i && array[i][k] % 2 == 0) {
					res = res + array[i][k] * array[i][k];
					count++;
				}
			}
		}

		System.out.println("Average square : " + Math.sqrt(res / count));

	}

	private static void displayArray(final int[][] array, final int row, final int col) {
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				System.out.print(array[i][k] + ", ");
			}
			System.out.println();
		}

	}

}
