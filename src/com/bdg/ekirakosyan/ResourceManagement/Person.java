package ResourceManagement;

public class Person {
    private int ID;
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String address[];

    public Person(final String firstName, final String lastName, final String middleName, final int age, final String[] address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String personInfo = "First Name: "+getFirstName()
                            +", Last Name: "+ getLastName()
                            + ", Middle Name: "+ getMiddleName()
                            + ", Age: "+ getAge();


        for(int i=0; i<getAddress().length; i++){
            personInfo += ", Address"+(i+1)+": ";
            personInfo += getAddress()[i];
            if(i<getAddress().length-1){
                personInfo += ", ";
            }
        }
        return personInfo;
    }
}
