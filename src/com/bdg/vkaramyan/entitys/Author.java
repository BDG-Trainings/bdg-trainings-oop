package com.bdg.vkaramyan.entitys;

public class Author {
	
	private String name;
	private String surname;
	private String gender;
	private int id;
	
	public Author(String name, String surname, String gender, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
