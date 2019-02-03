package com.bdg.spapoyan.PersonAndSubclasses;

public class Staff extends Person {

    private String school;
    private double pay;

    public Staff(final String name, final String address, final String school, final double pay ) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() { return school; }
    public void setSchool(String school) { this.school = school; }
    public double getPay() { return pay; }
    public void setPay(double pay) { this.pay = pay; }

    @Override
    public String toString(){
        return "Staff[Person[name = " + getName() + ", " + "address = " + getAddress() + "], "
                + "school = " + getSchool() + ", " + "pay = " + getPay() + "]";
    }
}

