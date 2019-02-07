package com.bdg.aiskandaryan.Lesson_10.Persons;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(final String name, final String address, final String school, final double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(final String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(final double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                ']';
    }
}
