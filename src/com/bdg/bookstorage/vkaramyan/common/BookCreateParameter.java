package com.bdg.bookstorage.vkaramyan.common;

import java.util.Arrays;

public final class BookCreateParameter {
	
	private String name;
	private double price;
	private AuthorCreateParameter [] authorCreateParameter;
	
	public BookCreateParameter(final String name, final double price, final AuthorCreateParameter[] authorCreateParameter) {
		
		this.name = name;
		this.price = price;
		this.authorCreateParameter = authorCreateParameter;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public AuthorCreateParameter[] getAuthorCreateParameter() {
		return authorCreateParameter;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setAuthorCreateParameter(AuthorCreateParameter[] authorCreateParameter) {
		this.authorCreateParameter = authorCreateParameter;
	}
	
	@Override
	public String toString() {
		return "BookCreateParameter [name=" + name + ", price=" + price + ", authorCreateParameter="
				+ Arrays.toString(authorCreateParameter) + "]";
	}
	
	

}
