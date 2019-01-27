package Lessons_09;

public class Person {
    private  String firstName;
    private String lastName;
    private String middleName;
    private short age;
    private Address[] addresses;

    public Person(String firstName, String lastName,String middleName,
                  short age, Address[] addresses){
        this.firstName=firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.addresses = addresses;

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

    public Address[] getAddress() {
        return addresses;
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
    public void setAddress(Address[] address) {
        this.addresses = addresses;
    }
}
