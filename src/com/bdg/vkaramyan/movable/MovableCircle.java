package com.bdg.vkaramyan.movable;

public class MovableCircle extends MovablePoint implements Movable{
	
	private int radius;
	private MovablePoint center;
	
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		super(x, y, xSpeed, ySpeed);
		this.radius = radius;
		center = new MovablePoint(x, y, xSpeed, ySpeed);
	}

	
	
	@Override
	public String toString() {
		return "MovableCircle [radius = "+ radius + ", center = " + center + "]";
	}



	@Override
	public void moveUp() {
		
		center.y += center.ySpeed;
		
	}
	
	@Override
	public void moveDown() {
		
		center.y -= center.ySpeed;
		
	}
	
	@Override
	public void moveLeft(){
		
		center.x -= center.xSpeed;
		
		
	}
	@Override
	public void moveRight() {
		
		center.x += center.y;
		
	}
	
	public static void main(String[] args) {
		Movable mc = new MovableCircle(2, 2, 150, 180, 2);
		mc.moveUp();
		mc.moveDown();
		mc.moveLeft();
		mc.moveRight();
		mc.toString();
		System.out.println(mc);
		
	}

}
