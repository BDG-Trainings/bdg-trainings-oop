package personandsubclasses;

public class Staff extends Person {
private String school;
private double pay;

public Staff (String name, String address,String school, double pay) {
	super(name, address);
	this.school = school;
	this.pay = pay;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
}

public double getPay() {
	return pay;
}
public void setPay(double pay) {
}
@Override
public String toString() {      
   return "Staff: subclass of " + super.toString() + " school =" + school + " + pay = " + pay;
} 
public static void main (String[] args) {
	Staff staffObj = new Staff(" Anahit " , " 5th Avenue ", " High School ", 50000 );
	System.out.print("Staff:" 
	      + staffObj.getName()
	      + staffObj.getAddress()
	      + staffObj.getSchool()
	      + staffObj.getPay());
		
}


}

