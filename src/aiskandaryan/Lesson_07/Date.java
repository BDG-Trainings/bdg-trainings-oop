package aiskandaryan.Lesson_07;

public class Date {
    int day;
    int month;
    int year;

    public Date(final int day, final int month, final int year) {
        setDate(day, month, year);
    }

    public void setDate(final int day, final int month, final int year) {
        if (year <= 9999 && year > 1900) {
            this.year = year;
        } else {
            this.year = 1900;
        }
        if (month <= 12 && month >= 1) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (day <= 31 && day >= 1) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(final int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(final int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String tmp = "";
        if (day > 31 || day < 1) {
            tmp = tmp + "01/";
        } else {
            if (day < 10) {
                tmp = tmp + "0";
            }
            tmp = tmp + day + "/";
        }
        if (month > 12 || month < 1) {
            tmp = tmp + "01/";
        } else {
            if (month < 10) {
                tmp = tmp + "0";
            }
            tmp = tmp + month + "/";
        }
        if (year > 9999 || year < 1900) {
            tmp = tmp + "1900";
        } else {
            tmp = tmp + year;
        }
        return tmp;
    }
}
