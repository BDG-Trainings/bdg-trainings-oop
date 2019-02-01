package com.bdg.vkaramyan.encapsulation;

public class Date {
	
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;

	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDate(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			day = 1;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;

		} else {
			month = 1;
		}

		if (year >= 1900 && year <= 9999) {
			this.year = year;
		} else {
		    //mb this.year ?
			year = 1900;
		}
	}

	public String toString() {
		return "dd/mm/yyyy" + "=" + "0" + day + "/" + "0" + month + "/" + year;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date(1, 7, 1982);
		System.out.println(date.toString());

	}

}
