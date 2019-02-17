package com.bdg.spapoyan.bas;


public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService(10);
        //Add missing functionality

        Address address = new Address(Country.AM, "aaa", "123");
        Account account = service.create("xxx", "ddd", Country.AM, "sd", "5555", 2000);
        Customer customer = new Customer(1, "Sergey", "Papoyan", address);
        System.out.println(Country.findByCountryName("Armenia"));
        System.out.println(account);
        System.out.println(customer);
    }

}
