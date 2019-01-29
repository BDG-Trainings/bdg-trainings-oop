package com.bdg.hhertevtsyan;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time (final int hour, final int minute, final int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    private boolean validation () {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            return true;
        } else {
            return false;
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 32) {
            this.hour = hour;
        } else {
            System.out.println("The hour value is not valid");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("The minute value is not valid");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("The second value is not valid");
        }
    }

    public void setTime (int hour, int minute, int second) {
        if (validation()) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("The Time value is not valid");
        }
    }

    public Time nextSecond () {
        this.second = this.second + 1;
        if (second > 59) {
            second = 0;
            minute++;
        }
        if (minute > 59) {
            minute = 0;
            hour++;
        }
        if (hour > 23) {
            hour = 0;
        }
        return this;
    }

    public Time previousSecond () {
        this.second = this.second - 1;
        if (second < 0) {
            second = 59;
            minute--;
        }
        if (minute < 0) {
            minute = 59;
            hour--;
        }
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }

    private String formatHour() {
        if (hour < 10) {
            return "0" + hour + ":";
        } else {
            return hour + ":";
        }
    }

    private String formatMinute() {
        if (minute < 10) {
            return "0" + minute + ":";
        } else {
            return minute + ":";
        }
    }


    private String formatSecond() {
        if (second < 10) {
            return "0" + second + ":";
        } else {
            return second + "";
        }
    }

    @Override
    public String toString() {
        return formatHour()+formatMinute()+formatSecond();
    }
}
