package com.bdg.hhertevtsyan.resourcemanagment;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private short age;
    private Address [] address;

    public Person (final String firstName, final String lastName, final String middleName, final short age, final Address [] address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public String getMiddleName() { return middleName;}

    public short getAge() { return age;}

    public Address[] getAddress() { return address;}

    public String getFullName () { return firstName + " " + lastName + " " + middleName;}

    public void setFirstName(String firstName) { this.firstName = firstName;}

    public void setLastName(String lastName) { this.lastName = lastName;}

    public void setMiddleName(String middleName) { this.middleName = middleName;}

    public void setAge(short age) { this.age = age;}

    public void setAddress(Address[] address) { this.address = address;}

    public String toString () {
        return "Employee [name = " + getFullName() + ", age = " + age + ", Address = " + address +"]";
    }
}
