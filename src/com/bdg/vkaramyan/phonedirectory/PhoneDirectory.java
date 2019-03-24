package com.bdg.vkaramyan.phonedirectory;


public class PhoneDirectory {

	private String name;
	private String number;
	
	public PhoneDirectory(String name, String number) {
		
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneDirectory [name=" + name + ", number=" + number + "]";
	}

	
	
}
