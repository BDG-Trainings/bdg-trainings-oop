package com.bdg.aiskandaryan.Lesson_07;

public class Time {
    //Make private
    int hour;
    int minute;
    int second;

    public Time(final int hour, final int minute, final int second) {
/*        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (minute <= 59 && minute >= 0) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        if (second <= 59 && second >= 0) {
            this.second = second;
        } else {
            this.second = 0;
        } */
        setTime(hour, minute, second);
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

    public void setHour(final int hour) {
        this.hour = hour;
    }

    public void setMinute(final int minute) {
        this.minute = minute;
    }

    public void setSecond(final int second) {
        this.second = second;
    }

    public void setTime(final int hour, final int minute, final int second) {
        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (minute <= 59 && minute >= 0) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        if (second <= 59 && second >= 0) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        if (hour > 23 || hour < 0) {
            tmp = tmp + "00:";
        } else {
            if (hour < 10) {
                tmp = tmp + "0";
            }
            tmp = tmp + hour + ":";
        }
        if (minute > 59 || minute < 0) {
            tmp = tmp + "00:";
        } else {
            if (minute < 10) {
                tmp = tmp + "0";
            }
            tmp = tmp + minute + ":";
        }
        if (second > 59 || second < 0) {
            tmp = tmp + "00";
        } else {
            if (second < 10) {
                tmp = tmp + "0";
            }
            tmp = tmp + second;
        }
        return tmp;
    }

    public Time nextSecond() {
        this.second++;
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

    public Time previousSecond() {
        this.second--;
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
}
