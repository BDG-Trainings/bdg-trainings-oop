package com.bdg.akarapetyan.bas;

public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService(10);
        //Add missing functionality

        Address address = new Address(Country.IT, "Moscovyan", "094566747" );
        System.out.println(address);
    }

}
