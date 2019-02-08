package abstraction.personandsubclasses;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff (String name, String address, String school, double pay){
        super(name, address);
        this.school=school;
        this.pay = pay;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString(){
        return "Staff [Person[name=" + name + ","+ "address="+address+ "],"+
                "school=" +school + ","+ "pay=" + pay +  "]";
    }
    public static void main(String[]args){
        Staff s = new Staff("Anna", "Erevan", " N 126", 350000);
        System.out.print(s.toString());
    }
}
