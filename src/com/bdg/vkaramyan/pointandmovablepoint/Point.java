package com.bdg.vkaramyan.pointandmovablepoint;

public class Point {
	
	private float x = 0.0f;
	private float y = 0.0f;
	
	public Point(final float x, final float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float[] getXY(){
		float[] arr = new float[2];
		arr[0] = this.x;
		arr[1] = this.y;

		return arr;

		}

	@Override
	public String toString() {
		return "Point [" + this.x + "," + this.y + "]";
	}
	
	public static void main(String[] args) {
		Point point = new Point();
		point.setX(5);
		System.out.println(point.getX());
	}

}
