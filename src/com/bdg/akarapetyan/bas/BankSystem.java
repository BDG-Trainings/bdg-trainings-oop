package com.bdg.akarapetyan.bas;

public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService();
        //Address address1 = new Address(Country.IT, "Moscovyan", "094566747" );
        //Address address2 = new Address(Country.AM, "Pushkin", "094111111" );
        //System.out.println(address);
        int customerid = 1;

        //System.out.println(customer1);
        //System.out.println(Country.findByCountryName("Italy"));
        //System.out.println(Country.findByNumericCode("051"));

        AccountBalance balance1 = new AccountBalance(5000);
        AccountBalance balance2 = new AccountBalance(2000);


        BankService bankService = new BankService();
        Account account1 = bankService.create(customerid,"Person1", "Surname1", Country.IT, "Pushkin", "094566747", 5000);
        customerid++;
        Account account2 = bankService.create(customerid,"Person2", "Surname2", Country.AM, "Moscovyan", "099111122", 2000);
        customerid++;
        Account account3 = bankService.create(customerid,"Arsen", "Karapetyan", Country.IT, "Moscovyan8", "099111111", 7000);
        customerid++;
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        bankService.transfer(account1,account2, 300);
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        bankService.transfer(account1,account3, 200);
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        System.out.println();
        Account account_search = bankService.findByCustomerName("Arsen");
        System.out.println(account_search.toString());
        System.out.println();
        Account[]accounts = bankService.findAllAccountsByCountry(Country.IT);
        bankService.toString(accounts);
    }
}
