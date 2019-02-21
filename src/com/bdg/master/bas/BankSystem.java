package com.bdg.master.bas;


public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService(10);
        service.create("Harutyun1","Hakobyan1",Country.FR,"Sebastia","12346679",150);
        Account [] acount = service.findAllAccountsByCountry(Country.FR);
        System.out.println(acount);
    }

}
