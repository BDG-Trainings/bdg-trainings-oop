package com.bdg.vkaramyan;

public class Circle {

    //make private
	double radius = 1.0;
	String color = "red";

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = "red";
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return String.format("Circle[radius = %f, color = %s]", getRadius(), getColor());

	}

	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		System.out.println(circle);
		circle.setRadius(3.0);
		circle.setColor("blue");
		System.out.println(circle.toString());
		System.out.println(circle.getArea());

	}


}
