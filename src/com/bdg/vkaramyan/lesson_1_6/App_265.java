package com.bdg.vkaramyan.lesson_1_6;

public class App_265 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] X = { 5, 1, 3, 6, 10, 3 };
		double[] Y = { 2, 5, 1, 4, 3, 5 };
		double sumX = 0;
		double countY = 1;
		
		
		for(int i = 0; i < X.length && i < Y.length; i++) {
			if(Y [i] != 0) {
				
				sumX += X[i];
				countY *= Y[i];
			}
		}
		
		System.out.println(sumX/countY);

	}

}
