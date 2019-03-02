package bankAccountSystem;

import bankAccountSystem.enums.Country;

public class Address extends AbstractBankEntity {
    private Country country
            private String street;
    private PhoneNumber[] phonenumber;

    public Address(Country country, String street, PhoneNumber[] phonenumber) {
        this.country = country;
        this.street = street;
        this.phonenumber = phonenumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public PhoneNumber[] getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(PhoneNumber[] phonenumber) {
        this.phonenumber = phonenumber;
    }
}
