package com.bdg.hhertevtsyan.personandsubclasses;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(final String firstName, final String lastName, final String middleName, final short age, final String address, final String program, final int year, final double fee) {
        super(firstName, lastName, middleName, age, address);
        setFirstName(firstName);
        setLastName(lastName);
        setMiddleName(middleName);
        setAddress(address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student [Person [name = " + this.getFullName() + ", address = " + this.getAddress() + ", program = " + program + ", year = " + year + ", fee = " + fee + "]";
    }
}


