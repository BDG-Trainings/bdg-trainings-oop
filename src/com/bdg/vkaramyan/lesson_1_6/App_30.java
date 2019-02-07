package com.bdg.vkaramyan.lesson_1_6;

public class App_30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1234;
		int b = 2345;
		int c = 879;

		if (a < b && b < c) {
			System.out.println(c + "\n" + b + "\n" + a);
		} else if (b < a && c < b) {
			System.out.println(a + "\n" + b + "\n" + c);
		} else {
			System.out.println(b + "\n" + a + "\n" + c);
		}

	}

}
