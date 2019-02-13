package com.bdg.vkaramyan.createUpdateObject;

public class BookUpdateParameter {
	
	private int id;
	private double price;
	
	public BookUpdateParameter(int id, double price) {
		super();
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	
}
