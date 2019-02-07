package com.bdg.vkaramyan.lesson_1_6;

public class App_230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = { 1, 0, 5, 8, 6, 4, 7, 9, 2, 3 };
		int k = 4;
		int m = 1;
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i<numbers.length; i++) {
			if((m/numbers[i])%k == 0) {
				sum += Math.pow(numbers[i], 2);
				count = count + 1;
			}
			i = i+1;
		}
		System.out.println("Average of sum is:" + Math.sqrt(sum / count));

	}

}
