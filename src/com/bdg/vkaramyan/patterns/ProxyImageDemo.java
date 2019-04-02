package com.bdg.vkaramyan.patterns;

public class ProxyImageDemo {
	
	public static void main(String[] args) {
		Image image = new ProxyImage("airplane-wing-backlit-beautiful-2007403.jpg");
		
		//image will be loaded from disk
		image.display();
		System.out.println("");
		
		 //image will not be loaded from disk
		image.display();
	}

}
