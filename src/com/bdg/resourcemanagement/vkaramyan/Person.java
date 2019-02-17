package com.bdg.resourcemanagement.vkaramyan;

import java.util.Arrays;

public class Person {

	private String firstName;
	private String lastName;
	private String middleName;
	private short age;
	private Address [] address;

	public Person(final String firstName, final String lastName, final String middleName, final short age, final Address [] address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.age = age;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public String getMiddleName() {
		return middleName;
	}

	public short getAge() {
		return age;
		
	}
	
	

	public Address[] getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", age="
				+ age + ", address=" + Arrays.toString(address) + "]";
	}

	
	

}
