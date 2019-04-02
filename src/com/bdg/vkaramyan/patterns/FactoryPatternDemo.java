package com.bdg.vkaramyan.patterns;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get an object of Circle and call its draw method.
		Shape shapeCircle = shapeFactory.getShape("Circle");
		//call draw method of Circle
		shapeCircle.draw();
		
		Shape shapeRectangle = shapeFactory.getShape("Rectangle");
		shapeRectangle.draw();

		Shape shapeSquare = shapeFactory.getShape("Square");
		shapeSquare.draw();

	}
	
	
}
