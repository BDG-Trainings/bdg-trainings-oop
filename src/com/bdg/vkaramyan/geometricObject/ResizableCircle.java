package com.bdg.vkaramyan.geometricObject;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);

	}

	@Override
	public void resize(int percent) {
		radius *= percent / 100.0;

	}

	public static void main(String[] args) {
		ResizableCircle GeometricObject = new ResizableCircle(5);
		GeometricObject.resize(10);
		System.out.println(GeometricObject);
	}

}
