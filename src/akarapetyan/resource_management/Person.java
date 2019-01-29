package akarapetyan.resource_management;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private short age;
    private Address [] addresses;

    public Person (String firstName, short age){
        this.firstName = firstName;
        this.age = age;
    }

    public Person (String firstName, String lastName, short age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person (String firstName, String lastName, String middleName, short age, Address [] addresses){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.addresses = addresses;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public short getAge() {
        return age;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(final Address[] addresses) {
        this.addresses = addresses;
    }

    public String toString() {
        return "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nMiddle name: " + middleName + "\nAge: " + age
                + "\nAddress 1: " + addresses[0].toString() + "\nAddress 2: " + addresses[1].toString() + "\nAddress 3: " + addresses[2].toString();
    }

}
