package com.bdg.spapoyan.bas;


public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService(10);
        //Add missing functionality

        Account account = service.create("xxx", "ddd", Country.AM, "sd", "5555", 2000);

    }

}
