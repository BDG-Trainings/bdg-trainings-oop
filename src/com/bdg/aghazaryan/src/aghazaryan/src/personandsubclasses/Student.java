package personandsubclasses;

public class Student extends Person {

	private String program;
	private int year;
	private double fee;
	
	public Student (String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;		
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String program) {
		
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setFee(double fee) {
		
	}

	@Override
	public String toString() {      
	   return "Student: subclass of " + super.toString() + " program = " + program + " + year = " + year +  " fee =" + fee;
	} 
	public static void main (String [] args) {
		Student studentObj = new Student(" Anahit ", " 5th Avenue ", " Master degree of Project Management / QA ", 1, 300000 );
		System.out.println ("Student:" 
				+ studentObj.getName()
				+ studentObj.getAddress()
				+ studentObj.getProgram()
				+ studentObj.getYear()
				+ studentObj.getFee());
				
				
			}
		}

