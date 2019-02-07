package com.bdg.vkaramyan.lesson_1_6;

public class App_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 9;
		int c = 1;
		int d = 5;
		boolean f;

		if ((a == b + c + d) || (b == a + c + d) || (c == a + b + d) || (d == a + b + c)) {
			f = true;
			System.out.println(f);
		} else {
			f = false;
			System.out.println(f);
		}

	}

}
