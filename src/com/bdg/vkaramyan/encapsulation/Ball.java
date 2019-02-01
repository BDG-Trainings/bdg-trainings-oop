package com.bdg.vkaramyan.encapsulation;

public class Ball {
	
	private int radius;
	private int diam;
	
	
	public Ball (final int radius, final int diam) {
		this.radius = radius;
		this.diam = diam;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiam() {
		return diam;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setDiam(int diam) {
		this.diam = diam;
	}

	//method names should start from lowercase
	public double volume() {
		int radius = diam/2;
		double volumeBall = ( 4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3 );
		return volumeBall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ball ball = new Ball(2, 4);
		ball.volume();
		System.out.println("Ball volume is:" + " " + ball.volume());

	}

}
