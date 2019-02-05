package com.bdg.vkaramyan.point2Dandpoint3D;

public class Point3D extends Point2D {

	private float z = 0.0f;

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;

	}

	public Point3D() {

		super();
		this.z = 0.0f;

	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void setXYZ(float x, float y, float z) {
		this.getXY();
		this.z = z;
	}

	public float[] getXYZ() {
		float[] arr = new float[3];
		arr[0] = this.getX();
		arr[1] = this.getY();
		arr[2] = this.z;
		return arr;
	}

	@Override
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + "," + this.z + ")";
	}

	public static void main(String[] args) {
		Point3D point3D = new Point3D();
		point3D.setX(3);
		point3D.setY(3);
		point3D.setZ(3);
		System.out.println(point3D.toString());
	}
}
