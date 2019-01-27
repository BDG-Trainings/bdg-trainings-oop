package com.bdg.vkaramyan;

public class Time {
	
	int hour;
	int minute;
	int second;
	
	public Time (final int hour, final int minute, final int second) {
		this.hour  = hour;
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
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		if (hour > 0 && hour <= 23) {
			this.hour = hour;
		} else {
			hour = 0;
		}
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;

		} else {
			minute = 0;
		}

		if (second >= 0 && second <= 59) {
			this.second = second;
		} else {
			second = 0;
		}
	}
	
	public String toString() {
		return String.format("hh:mm:ss" + " " + "=" + " " + hour + ":" + minute + ":" + second);
	}
	public Time nextSecond() {
		this.second++;
		return this;
	}
	
	public Time previousSecond() {
		this.second--;
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time (13, 15, 45);
		System.out.println(time);
		System.out.println(time.nextSecond());
		System.out.println(time.previousSecond());

	}

}
