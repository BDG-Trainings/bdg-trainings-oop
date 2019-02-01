package com.bdg.ekirakosyan.Time;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond(){
        this.second = this.second + 1;
        return this;
    }

    public Time prevSecond(){
        this.second = this.second -1;
        return this;
    }

    @Override
    public String toString() {
        String result = getHour() + ":" + getMinute() + ":" + getSecond();
        return result;
    }

}
