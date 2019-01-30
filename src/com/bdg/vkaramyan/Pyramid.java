package com.bdg.vkaramyan;

//Change Pyramid class construction from primitive to reference type (side, height => Triangle class)
public class Pyramid {

	private double baseLenght;
	private double baseWidth;
	private double height;

	public Pyramid() {

	}

	public double getBaseLenght() {
		return baseLenght;
	}

	public double getBaseWidth() {
		return baseWidth;
	}

	public double getHeight() {
		return height;
	}

	public void setBaseLenght(double baseLenght) {
		this.baseLenght = baseLenght;
	}

	public void setBaseWidth(double baseWidth) {
		this.baseWidth = baseWidth;
	}

	public void setHeight(double height) {
		this.height = height;

	}

	public double pyramidVolume(final double baseLenght, final double baseWidth, final double height) {
		double baseArea = baseLenght * baseWidth;
		return baseArea * height / 3;
	}

	public static void main(String[] args) {

		Pyramid pyramid = new Pyramid();
		System.out.println("Volume: " + pyramid.pyramidVolume(10, 20, 15));

	}

}
