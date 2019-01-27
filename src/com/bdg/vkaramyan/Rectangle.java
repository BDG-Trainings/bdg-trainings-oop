package com.bdg.vkaramyan;

public class Rectangle {
	

	float lenght = 1.0f;
	float width = 1.0f;
	
	public Rectangle() {
		
	}
	
	public Rectangle(float lenght, float width) {
		this.lenght = lenght;
		this.width = width;
		
	}
	
	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
		
	}
	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
		
	}
	
	public double getArea() {
		double area = lenght*width;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2*(lenght+width);
		return perimeter;
	}
	
	public String toString() {
		return String.format("Regtangle[lenght = %s, width = %s]", getLenght(), getWidth());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle regtangle = new Rectangle();
		System.out.println(regtangle);
		regtangle.setLenght(5.0f);
		regtangle.setWidth(3.0f);
		System.out.println(regtangle.getArea());
		System.out.println(regtangle.getPerimeter());
		System.out.println(regtangle.toString());
	}
	


}
