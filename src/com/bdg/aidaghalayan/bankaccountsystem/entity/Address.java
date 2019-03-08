package com.bdg.aidaghalayan.bankaccountsystem.entity;


public final class Address extends AbstractBankEntity {
    private Country country;
    private String street;

    public Address(final Country country, final String street) {
        this.country = country;
        this.street = street;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", street='" + street + '\'' +
                ", id=" + id +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", deletedDate=" + deletedDate +
                '}';
    }
}
