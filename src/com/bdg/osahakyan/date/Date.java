package com.bdg.osahakyan.date;

public class Date {
        private int day;
        private int month;
        private int year;

        public Date (int day, int month, int year){
            setDate(day, month, year);
        }

        public int getDay() {
            return day;
        }
        public void setDay(int day) {
        this.day = day;
    }

        public int getMonth() {
            return month;
        }
        public void setMonth(int month) {
        this.month = month;
    }

        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }

        public void setDate (int day, int month, int year){
            if (day > 0 && day < 32){
                this.day = day;
            } else {
                System.out.println("The day value is incorrect.");
            }

            if (month > 0 && month < 13){
                this.month = month;
            } else {
                System.out.println("The month value is incorrect.");
            }

            if (year > 1899 && year < 10000){
                this.year = year;
            } else {
                System.out.println("The year value is incorrect");
            }
        }

        public String toString() {

            String day_string;
            String month_string;
            String year_string;

            if (day < 10) {
                day_string = "0" + day;
            } else {
                day_string = new Integer(day).toString();
            }

            if (month < 10) {
                month_string = "0" + month;
            } else {
                month_string = new Integer(month).toString();
            }

            if (year < 10) {
                year_string = "0" + year;
            } else {
                year_string = new Integer(year).toString();
            }

            String time = day_string + "/" + month_string + "/" + year_string;;
            return time;
        }
}


