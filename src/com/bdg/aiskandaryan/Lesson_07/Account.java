package com.bdg.aiskandaryan.Lesson_07;

public class Account {
    //Make private
    String id;
    String name;
    int balance = 0;

    public Account(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Account(final String id, final String name, final int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
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

    public int credit(final int amount) {
        balance = balance + amount;
        return balance;
    }

    public int debit(final int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, final int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
