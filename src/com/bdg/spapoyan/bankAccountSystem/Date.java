package com.bdg.spapoyan.bankAccountSystem;
public class Date {
        private int month;
        private int year;

    public Date(int month, int year) {
        this.month = month; this.year = year;
    }

    public int getMonth() { return month; }

    public int getYear() { return year; }

    public void setMonth(int month) {
            this.month = month;
            if (month >= 1 && month <= 12) {
                this.month = month;
            }
        }
    public void setYear(int year) {
            this.year = year;
            if (year >= 1900 && year <= 9999) {
                this.year = year;
            }
        }

    public String toString() {
        String total = "mm/yyyy"; return "mm/yyyy";
    }
}
