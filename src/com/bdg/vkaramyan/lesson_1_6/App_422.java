package com.bdg.vkaramyan.lesson_1_6;

import java.util.Random;

public class App_422 {

	private final static Random random = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int m = 4;

		int[][] array = new int[m][m];
		int sum = 0;
		int count = 0;

		for (int i = 0; i < m; i++) {
			for (int k = 0; k < m; k++) {
				array[i][k] = random.nextInt(100);
			}

		}
		displayArray(array, m, m);

		for (int i = 0; i < m; i++) {
			for (int k = 0; k < i; k++) {
				if (k > i) {
					if (array[k][i] % 5 == 0 && array[k][i] != 0) {
						count++;
						sum = sum + array[k][i];
					}

				}
			}
			System.out.println("Average is:" + (double) sum / count);
		}
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
