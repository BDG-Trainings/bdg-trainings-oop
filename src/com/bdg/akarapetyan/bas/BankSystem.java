package com.bdg.akarapetyan.bas;

public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService();
        Address address = new Address(Country.IT, "Moscovyan", "094566747" );
        //System.out.println(address);
        Customer customer = new Customer(1, "Arsen", "Karapetyan", address );
        System.out.println(customer);
        System.out.println(Country.findByCountryName("Italy"));
        System.out.println(Country.findByNumericCode("051"));
    }

}