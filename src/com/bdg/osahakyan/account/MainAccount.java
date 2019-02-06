package com.bdg.osahakyan.account;

public class MainAccount {
    public static void main(String[] args){
        Account account = new Account("id", "name",100);
        System.out.println(account.toString());
    }
}
