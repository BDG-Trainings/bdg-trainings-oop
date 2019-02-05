package com.bdg.vkaramyan.shapeandcircleandregtangleandsquare;

public class Rectangle extends Shape {
	
	private double width = 1.0;
	private double length = 1.0;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		 double area = width*length;
		 return area;
	 }
   
	 public double getPerimeter() {
		 double perimeter = 2*(width + length);
		 return perimeter;
	 }

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(5);
		rectangle.setWidth(10);
		System.out.println("Rectangle area is:" + " " + rectangle.getArea());
		System.out.println("Rectangle parimeter is:" + " " + rectangle.getPerimeter());
		System.out.println(rectangle.toString());
		
	}
}
