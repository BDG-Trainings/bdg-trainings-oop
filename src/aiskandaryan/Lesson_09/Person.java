package aiskandaryan.Lesson_09;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private short age;
    private Address [] addresses;

    public Person(final String firstName,final String lastName, final String middleName, final short age, final Address [] addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.addresses = addresses;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setAge(final short age) {
        this.age = age;
    }

    public short getAge() {
        return age;
    }

    public void setAddresses(final Address[] addresses) {
        this.addresses = addresses;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public boolean addAddress(final Address address) {
        int addressesLength = addresses == null? 0 : addresses.length; // if addresses array is null, then it's length is 0
        Address [] newAddresses = new Address[addressesLength + 1];
        for (int i = 0; i < addressesLength; i++) {
            newAddresses[i] = addresses[i];
        }
        newAddresses[addressesLength] = address;
        addresses = newAddresses;
        return true;
    }

    public boolean removeAddress(final Address address) {
        int addressesLength = addresses == null? 0 : addresses.length; // if addresses array is null, then it's length is 0
        if (addressesLength > 0) {
            Address[] newAddresses = new Address[addresses.length - 1];
            int indexDelta = 0;
            for (int i = 0; i + indexDelta < addresses.length; i++) {
                if (addresses.equals(addresses[i])) {
                    indexDelta = 1;
                }
                newAddresses[i] = addresses[i + indexDelta];
            }
            addresses = newAddresses;
            return true;
        }
        return false;
    }
}
