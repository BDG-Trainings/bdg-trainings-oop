package com.bdg.vkaramyan.enums;

public class DaysOfWeek {
	
	public enum Weekdays {
		
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
			
	}

	
	public static void main(String[] args) {
		
		Weekdays [] days = Weekdays.values();
		for(Weekdays day : days) {
			System.out.println(day);
		}
		
	}

}
