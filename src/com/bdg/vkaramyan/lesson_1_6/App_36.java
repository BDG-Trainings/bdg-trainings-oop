package com.bdg.vkaramyan.lesson_1_6;

public class App_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		int c=6;
		int d=5;
	
		
		if((a%2==1 && b%2==1)||(a%2==1 && c%2==1) || (a%2==1 && d%2==1)) {
			System.out.println("1");
		}else {
			if((b%2==1 && c%2==1) || (b%2==1 && d%2==1)){
				System.out.println("1");
			}else {
				if(c%2==1 && d%2==1) {
					System.out.println("1");
				}else {
					System.out.println("2");
				}
			}
		}
	}

}
