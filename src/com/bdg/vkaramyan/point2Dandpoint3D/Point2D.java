package com.bdg.vkaramyan.point2Dandpoint3D;

public class Point2D {

	private float x = 0.0f;
	private float y = 0.0f;

	public Point2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point2D() {
		super();
		this.x = 0;
		this.y = 0;
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

	public float[] getXY() {
		float[] arr = new float[2];
		arr[0] = this.x;
		arr[1] = this.y;
		return arr;
	}

	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}
