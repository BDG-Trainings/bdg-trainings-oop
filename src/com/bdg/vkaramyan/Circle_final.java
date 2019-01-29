package com.bdg.vkaramyan;

//Class names should not contains underscore replace Circle_final => CircleFinale
public class Circle_final {
	double radius = 1.0;

	public Circle_final() {
		
	}

	public Circle_final(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public double getCircumference() {
		double circumference = Math.PI * (2 * radius);
		return circumference;

	}

	public String toString() {
		return String.format("Circle[radius= %s]", getRadius());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle_final circle = new Circle_final();
		System.out.println(circle);
		circle.setRadius(3.0);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		

	}


}
