package com.bdg.hhertevtsyan.personandsubclasses;

public class Staff extends Person {
    private String school;
    private double pay;
    public Staff(final String firstName, final String lastName, final String middleName, final short age, final String address, final String school, final double pay) {
        super(firstName, lastName, middleName, age, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString () {
        return "Staff [Person [ name = " + getFullName() + ", address " + getAddress() + ", school = " + school + ", pay =" + pay + "]";
    }
}
