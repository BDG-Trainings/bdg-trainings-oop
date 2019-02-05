package com.bdg.vkaramyan.personandstudentandstuff;

public class Staff extends Person {

	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
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
	public String toString() {
		return super.toString() + "\n" + "Staff [school=" + school + ", pay=" + pay + "]";
	}

	public static void main(String[] args) {
		Staff staff = new Staff("Vika", "Yerevan", "Basic colleage", 100000);
		System.out.println(staff.toString());
	}

}
