package com.bdg.spapoyan.bankAccountSystem;

public class Date {

        private int month;
        private int year;

    public Date(final int month, final int year) {
        setDate(month, year);
    }
    public void setDate(final int month, final int year){
        if (month >= 1 && month <= 12){
            this.month = month;
        }else {
            this.month = 0;
        }
        if (year > 2014 && year < 2100){
            this.year = year;
        }else {
            this.year = 0;
        }
    }
    @Override
    public String toString() {
        return month + "/" + year;
    }
}
