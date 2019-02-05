package com.bdg.vkaramyan.circleandcylinder;

public class Cylinder extends Circle{
	private double height = 1.0;

	public Cylinder() {

	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;

	}

	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		double volume = getArea() * height;
		return volume;
	}

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder();
		cylinder.getArea();
		cylinder.setHeight(5);
		System.out.println(cylinder.getVolume());
		cylinder.setRadius(3);
		cylinder.setColor("blue");
		System.out.println(cylinder.toString());
	}


}
