package com.bdg.vkaramyan.shapeandcircleandregtangleandsquare;

public class Square extends Rectangle {

	public Square() {
		super();
		
	}

	public Square(double side) {
		super (side, side);
		
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
		
	}
	
	public double getSide() {
		return getSide();
		
	}

	public void setSide(double side) {
		this.getSide();
		
	}

	@Override
	public void setWidth(double side) {
		// TODO Auto-generated method stub
		super.setWidth(side);
	}

	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		super.setLength(side);
	}

	@Override
	public String toString() {
		return "Square [getSide()=" + getSide() + ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Square square = new Square(10);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
		
	}


	
	

}
