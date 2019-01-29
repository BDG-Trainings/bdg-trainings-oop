package com.bdg.agalayan.lessons_07;

public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int hour, int minute, int second) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        }
        if (minute > 0 && minute < 60) {
            this.minute = minute;
        }
        if (second > 0 && second < 60) {
            this.second = second;
        }
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

    public void setHour(int hour) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute > 0 && minute < 60) {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setHour() {
        if (second > 0 && second < 60) {
            this.hour = hour;
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        }
        if (minute > 0 && minute < 60) {
            this.minute = minute;
        }
        if (second > 0 && second < 60) {
            this.second = second;
        }
    }

    public String toString() {
        String jam = " " + hour;
        if (hour < 10) {
            jam = "0" + hour;
        }
        String rope = " " + minute;
        if (minute < 10) {
            rope = "0" + minute;
        }
        String vayrkyan = " " + second;
        if (second < 10) {
            vayrkyan = "0" + second;
        }
        return " " + jam + ":" + rope + ":" + vayrkyan;
    }

    public Time nextTime() {
        if (second < 59) {
            second++;
        } else {
            second = 0;
            if (minute < 59) {
                minute++;
            } else {
                minute = 0;
                if (hour < 24) {
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousTime() {
        if (second != 0) {
            second --;
        } else {
            second=59;
            if (minute != 0) {
                minute--;
            } else {
                minute = 59;
            }
            if (hour != 0 ) {
                hour --;
            } else {
                hour=23;
            }

        } return this;
    }

    public static void main(String[] args) {
        Time jam = new Time(23, 20, 59);
        System.out.println(jam.toString());
        System.out.println(jam.previousTime());
        System.out.println(jam.nextTime());
        System.out.println(jam.nextTime());
    }
}
