package com.bdg.vkaramyan;

public class Time {
	
	int [] hour = {0, 23};
	int [] minute = {0, 59};
	int [] second = {0, 59};
	
	public Time (int [] hour, int[] minute, int [] second) {
		this.hour  = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int [] getHour() {
		return hour;
	}
	
	public int [] getMinute() {
		return minute;
	}
	
	public int [] getSecond() {
		return second;
	}
	
	public void setHour(int [] hour) {
		this.hour = hour;
	}
	
	public void setMinute(int [] minute) {
		this.minute = minute;
	}
	
	public void setSecond(int [] second) {
		this.second = second;
	}
	
	public void setTime(int [] hour, int [] minute, int [] second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public String toString() {
		return String.format("hh:mm:ss",  getHour(), getMinute(), getSecond());
	}
	
	public Time nextSecond() {
		
	}
	
	public Time previousSecond() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
