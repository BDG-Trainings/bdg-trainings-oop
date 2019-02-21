package com.bdg.vkaramyan.movable;

public class MovablePoint implements Movable{
	
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		y += ySpeed;
	}
	
	@Override
	public void moveDown() {
		y -= ySpeed;
	}
	
	@Override
	public void moveLeft(){
		x -= xSpeed;
		
	}
	@Override
	public void moveRight() {
		x += xSpeed;
	}
	
	
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

	public static void main(String[] args) {
		MovablePoint mp = new MovablePoint(5, 5, 150, 180);
		System.out.println(mp.toString());
		
	}

}
