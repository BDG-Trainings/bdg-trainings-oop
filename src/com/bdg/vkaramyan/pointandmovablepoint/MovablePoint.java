package com.bdg.vkaramyan.pointandmovablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
	
	private float xSpeed = 0.0f;
	private float ySpeed = 0.0f;
	
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	
	public MovablePoint() {
		super();
		
	}
	
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public float [] getSpeed() {
		float [] arr = new float [2];
		arr [0] = this.xSpeed;
		arr [1] = this.ySpeed;
		 return arr;
	}

	

	public MovablePoint move() {
	     setX(getX() + xSpeed);
	     setY(getY() + ySpeed);
	     return this; 
	   }
	   
	@Override
	public String toString() {
		return "MovablePoint [getSpeed()=" + Arrays.toString(getSpeed()) + ", toString()=" + super.toString() + " =  (xs, xy)]";
		
	}
	   
	public static void main(String[] args) {
	     MovablePoint movablePoint = new MovablePoint();
	     movablePoint.setX(5);
	     movablePoint.setY(9);
	     movablePoint.setxSpeed(130);
	     movablePoint.setySpeed(180);
	     System.out.println(movablePoint.move());
	
	
	   }
}
