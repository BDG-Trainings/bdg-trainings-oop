package com.bdg.vkaramyan.encapsulation;

public class Cuboid {
	
	private int height;
	private int length;
	private int width;
	
	public Cuboid (final int height, final int length, final int width) {
		this.height = height;
		this.length = length;
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int Volume() {
		int volume = width*length*height;
		return volume;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuboid cuboid = new Cuboid(5, 5, 8);
		System.out.println("Cuboid volume is:" + " " + cuboid.Volume());

	}

}
