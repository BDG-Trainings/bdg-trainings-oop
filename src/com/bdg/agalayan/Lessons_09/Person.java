package com.bdg.agalayan.Lessons_09;

public class Person {
    private  String firstName;
    private String lastName;
    private int age;
    private Address[] addresses;
    private int currentAddress;

    public Person(String firstName, String lastName,
                  int age, Address[] addresses){
        this.firstName=firstName;
        this.lastName = lastName;
        this.age = age;
        this.addresses = addresses;

    }

    public int getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(int currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public Address[] getAddress() {
        return addresses;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        if(currentAddress< addresses.length){
            addresses[currentAddress]=address;
            currentAddress++;
        }
    }
    @Override
    public String toString(){
        return "Person[firstName:"+getFirstName()+ ","+
                "lastName:"+getLastName()+","+
                "age:"+getAge() +","+
                "address:"+getAddress()+"]";
    }
}
