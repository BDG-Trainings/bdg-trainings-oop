package com.bdg.bookstorage.vkaramyan.common;

public final class BookUpdateParameter {
	
	private String name;
	private int id;
	private double price;
	
	public BookUpdateParameter(final String name, final int id, final double price) {
		
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "BookUpdateParameter [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
	

}
