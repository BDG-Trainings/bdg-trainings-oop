package com.bdg.vkaramyan.circleandcylinder;

public class Circle {
	
	private double radius = 1.0;
	private String color = "red";

	public Circle() {
		super();
	}

	public Circle(double r) {
		super();
		this.radius = r;
	}

	public Circle(double r, String c) {
		super();
		this.radius = r;
		this.color = c;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		this.color = c;
	}

	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public String toString() {
		return String.format("Circle[radius = %f, color = %s]", getRadius(), getColor());
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Circle area is:" + " " + circle.getArea());
		circle.setColor("blue");
		circle.setRadius(2);
		System.out.println(circle.toString());

	}

}
