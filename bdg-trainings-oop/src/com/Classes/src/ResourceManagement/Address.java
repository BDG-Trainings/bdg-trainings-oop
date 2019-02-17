package ResourceManagement;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(final String street, final String city, private String state, private String zipCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public void setStreet(final String street){
        this.street = street;
    }
    public void setCity(final String city){
        this.city = city;
    }
    public void setState(final String state){
        this.state = state;
    }
    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getzipCode(){
        return zipCode;
    }

    }
