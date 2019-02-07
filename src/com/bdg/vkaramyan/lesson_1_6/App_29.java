package com.bdg.vkaramyan.lesson_1_6;

public class App_29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1234;
		int b = 2345;
		int c = 879;

		if (a < b && b < c) {
			System.out.println(a + "\n" + b + "\n" + c);
		} else if (b < a && c < b) {
			System.out.println(b + "\n" + c + "\n" + a);
		} else {
			System.out.println(c + "\n" + a + "\n" + b);
		}

	}

}
