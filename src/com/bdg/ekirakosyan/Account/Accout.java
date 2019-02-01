package com.bdg.ekirakosyan.Account;

public class Accout {
    String id;
    String name;
    int balance=0;

    public Accout(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Accout(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount){
        return amount + getBalance();
    }

    public int debet(int amount){
        if (amount <= getBalance()) {
            balance = getBalance() - amount;
        } else {
            System.out.println("Amount Exceeded Balance");
        }
        return balance;
    }

    public int transferTo(Accout another, int amount){
        if (amount <= getBalance()) {
            System.out.println("Transfer Amount to the given account");
        } else {
            System.out.println("Amount Exceeded Balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id="+getId()+"; name="+getName()+"; balance="+getBalance();
    }
}
