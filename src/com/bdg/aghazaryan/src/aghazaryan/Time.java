package aghazaryan;

public class Time {
   private int hour;
   private int minute;
   private int second;
   
public Time(int hour, int minute, int second) {
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
	hour =  ((hour >= 0 && hour <= 23) ? hour : 0);
    minute = ((minute >=0 && minute <= 59) ? minute : 0);
    second = ((second >=0 && second <= 59) ? second : 0);
	
}

public String toString() {
	return String.format("%02d:%02d:%02d", hour, minute,second );
}

public Time nextSecond() {
	this.second ++;
	return this;
}

public Time previousSecond() {
	this.second--;
	return this;
}
public static void main (String[] args) {
	Time timeObj = new Time(14, 20, 23);
	System.out.println(timeObj.toString());
	System.out.println(timeObj.nextSecond());
	System.out.println(timeObj.previousSecond());
}

}