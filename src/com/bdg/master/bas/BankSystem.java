package com.bdg.master.bas;


public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService(10);
        service.create("Harutyun","Hakobyan",Country.FR,"Sebastia","12346679",50);
        System.out.println(service.findByCustomerName("Harutyun"));
    }

}
