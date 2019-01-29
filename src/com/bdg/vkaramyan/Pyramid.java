package com.bdg.vkaramyan;


//Change Pyramid class construction from primitive to reference type (side, height => Triangle class)
public class Pyramid {
	
	private int side;
	private int height;
	
	
	public Pyramid (final int side, final int height) {
		this.side = side;
		this.height = height;
		
	}
	
	public int getSide() {
		return side;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	public void setSide(int side) {
		this.side = side;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int Volume() {
		int sqr = side/2;
		int volume = ((sqr)*height) / 3;
		return volume;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pyramid pyramid = new Pyramid(10, 10);
		pyramid.Volume();
		System.out.println("Pyramid volume is:" + " " + pyramid.Volume());

	}

}
