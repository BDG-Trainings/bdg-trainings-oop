package com.bdg.bookstorage.vkaramyan.common;

public class BookCreateParameter {
	
	private String name;
	private double price;
	
	
	public BookCreateParameter(final String name, final double price) {
		this.name = name;
		this.price = price;
		
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "BookCreateParameter [name=" + name + ", price=" + price + "]";
	}
	
	

}
