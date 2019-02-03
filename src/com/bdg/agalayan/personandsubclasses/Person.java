package personandsubclasses;

public class Person {
    protected String name;
    protected String address;



    public Person(){
        this.name=name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toStrig(){
        return "personandsubclasses.Person [name="+ name + "," + "address="+ address + "]";
    }
}
