package com.bdg.vkaramyan.patterns;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		return instance;
		
	}
	
	public void showMessage() {
		System.out.println("New message");
	}
	
	public static void main(String[] args) {
		Singleton singleton = new Singleton();
		singleton.showMessage();
		
	}

}
