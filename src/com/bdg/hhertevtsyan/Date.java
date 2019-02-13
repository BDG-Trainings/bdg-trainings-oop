package com.bdg.hhertevtsyan;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(final int day, final int month, final int year) {
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

    private boolean isValid() {
        if (day > 0 && day < 32 && month > 0 && month < 12 && year > 1899 && year < 10000) {
            return true;
        } else {
            return false;
        }
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
            this.day = day;
        } else {
            System.out.println("The day value is not valid");
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month < 12) {
            this.month = month;
        } else {
            System.out.println("The month value is not valid");
        }
    }

    public void setYear(int year) {
        if (year > 1899 && year < 10000) {
            this.year = year;
        } else {
            System.out.println("The year value is not valid");
        }
    }

    public void setDate(int day, int month, int year) {
        if (isValid()) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("The Date value is not valid");
        }
    }

    private String formatMonth() {
        if (month < 10) {
            return "0" + month + "/";
        } else {
            return month + "/";
        }
    }

    private String formatDay() {
        if (day < 10) {
            return "0" + day + "/";
        } else {
            return day + "/";
        }
    }

    @Override
    public String toString() {
        return formatDay() + formatMonth() + year;
    }
}
