package abstraction.personandsubclasses;

public abstract class Person {
    protected String name;
    protected String address;



    public Person(String name, String address){
        this.name= name;
        this.address =address;
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

    public abstract String toString();


}
