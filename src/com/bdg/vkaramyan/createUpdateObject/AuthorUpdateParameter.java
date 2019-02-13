package com.bdg.vkaramyan.createUpdateObject;

public class AuthorUpdateParameter {
	
	private int id;
	private String name;
	private String surname;
	
	
	public AuthorUpdateParameter(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}


	
	

}
