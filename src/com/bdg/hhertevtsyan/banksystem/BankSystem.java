package com.bdg.hhertevtsyan.banksystem;

public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService(10);
        Account [] accounts = new Account[service.getMaxAccountSize()];
        accounts[0] = service.create(9005001,"Hayk", "Hertevtsyan", Country.AM, "Yerevan", "Nazarbekyan 31a, apt. 5", "+37491377576", 300000);
        System.out.println(service.findByCustomerName("Hayk", "Hertevtsyan").getCustomer().toString());
        System.out.println(service.findByCustomerName("Hayk", "Hertevtsyan").getBalance());

        accounts[1] = service.create(9005002,"Ani", "Mesropyan", Country.AM, "Yerevan", "Nazarbekyan 31a, apt. 5", "+37491987874", 50000);
        System.out.println(service.findByCustomerName("Ani", "Mesropyan").getCustomer().toString());
        System.out.println(service.findByCustomerName("Ani", "Mesropyan").getBalance());


        service.transfer(service.findByCustomerName("Ani", "Mesropyan"), service.findByCustomerName("Hayk","Hertevtsyan"), 10000);

        System.out.println(service.findByCustomerName("Ani", "Mesropyan").getBalance());
        System.out.println(service.findByCustomerName("Hayk", "Hertevtsyan").getBalance());


        System.out.println(accounts[0].getCustomer().getAddress().getCountry().findByCountryName("Armenia"));

        System.out.println(accounts.length);

        System.out.println(service.getCurrentAccountSize());

        //Add missing functionality
    }

}
