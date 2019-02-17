package com.bdg.vqertikyan.bas;


public final class BankSystem {

    public static void main(String[] args) {
        //Add missing functionality

        System.out.println(Country.findByCountryName("Armenia"));
        System.out.println(Country.findByNumericCode("380"));

        BankService bankService = new BankService(4); //????? if here instead 4  write 20 findAllAccountWithBalanceRange not work, why?????????

        Account account1 = bankService.create("name1", "surname1", Country.IT, "street1", "phone1", 5000);
        Account account2 = bankService.create("name2", "surname2", Country.AM, "street2", "phone2", 1000);
        Account account3 = bankService.create("name3", "surname3", Country.AF, "street3", "phone3", 3000);
        Account account4 = bankService.create("name4", "surname4", Country.IT, "street4", "phone4", 4000);

     //   System.out.println(bankService.transfer(account3, account2, 300));
        System.out.println(bankService.findAllAccountWithBalanceRange(1000, 3000));
        System.out.println(bankService.findByCustomerName("name3"));
        System.out.println(bankService.findAllAccountsByCountry(Country.IT));
    }

}
