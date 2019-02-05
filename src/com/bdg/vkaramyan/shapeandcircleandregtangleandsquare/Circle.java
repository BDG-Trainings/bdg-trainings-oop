package com.bdg.vkaramyan.shapeandcircleandregtangleandsquare;

public class Circle extends Shape {
	 private double radius = 1.0;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
			
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	 
	 public double getArea() {
		 double area = Math.PI*Math.pow(radius, 2);
		 return area;
	 }
   
	 public double getPerimeter() {
		 double perimeter = 2*Math.PI*(2*radius);
		 return perimeter;
	 }

	@Override
	public String toString() {
		return "Circle [radius=" + radius + " + color=" + getColor() + " + filled=" + isFilled() + "]";
	}
	 
	 public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(3);
		System.out.println("Circle area is:" + " " + circle.getArea());
		System.out.println("Circle parimeter is:" + " " + circle.getPerimeter());
		System.out.println(circle.toString());
		
	}
}	 
