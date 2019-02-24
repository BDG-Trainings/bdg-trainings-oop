package com.bdg.bookstorage.vkaramyan.common;

public class AuthorCreateParameter {
	
	private String name;
	private String surname;
	private Gender gender;
	
	public AuthorCreateParameter(final String name, final String surname, final Gender gender) {
		
		this.name = name;
		this.surname = surname;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "AuthorCreateParameter [name=" + name + ", surname=" + surname + ", gender=" + gender + "]";
	}
	
	

}
