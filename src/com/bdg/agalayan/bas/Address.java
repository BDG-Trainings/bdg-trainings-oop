package bas;


public final class Address {

    private Country country;
    private String street;
    private String phoneNumber;

    public  Address(Country country, String street, String phoneNumber){
        this.country=country;
        this.phoneNumber=phoneNumber;
        this.street=street;
    }

    public Country getCountry() {
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    @Override
    public String toString(){
        return "address [Country = "+ getCountry()+ ","+ "street = "+ getStreet()+ ","
                + "phoneNumber = " + getPhoneNumber();
    }
}
