package com.bdg.hhertevtsyan;

public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account (final String id, final String name) {
        this.id=id;
        this.name=name;

    }
    public Account (final String id, final String name, final int balance) {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit (final int amount) {
        balance=amount;
        return balance;
    }
    public int debit(final int amount) {
        if (amount<=balance) {
            balance=balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(final Account another, final int amount){
        if (amount<=balance) {
            another.balance=amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
