package com.bdg.vkaramyan.lesson_1_6;

public class App_32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		int b = 3;
		int c = -5;
		int d = 0;

		if (a <= b && a <= c && d <= a) {
			System.out.println("Min number is:" + a);
		} else {
			if (b <= c && b <= d) {
				System.out.println("Min number is:" + b);
			} else {
				if (c <= d) {
					System.out.println("Min number is:" + c);
				} else {
					System.out.println("Min number is:" + d);
				}
			}
		}
	}
}
