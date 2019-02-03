package aghazaryan;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year= year;		
	}
	public int getDay() {
	return day;

}
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int day) {
		if (day > 0 && day <= 31) {
	    this.day = day;
	} else { 
		System.out.println("invalid");
	}
	}
	
	public void setMonth(int month) {
		if (month > 0 && month <= 12) {
			this.month = month;
		} else { 
			System.out.println("invalid");
		}
		
	}
	public void setYear(int year) {
		if (year >= 1900 && year <= 1999) {
			this.year = year;
		}else { 
				System.out.println("invalid");
			}
		}
		
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year= year;
	
	}
	
	public String toString() {
		return String.format("%d/%d/%d", day, month, year );
	}
	
	public static  void main (String[] args) {
		Date dateObj = new Date(23, 11, 1991);
		System.out.println(dateObj.toString());		
		
	}

}