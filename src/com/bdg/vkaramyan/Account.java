package com.bdg.vkaramyan;

public class Account {
	
	String id;
	String name;
	int balance = 0;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;

	}

	public Account(String id, String name, int balance) {
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

	public int credit(int amount) {
		balance += amount;
		return balance;
	}

	public int debit(int amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	public int transferTo(Account another, int amount) {
		if (amount <= balance) {
			balance -= amount;
			another.credit(amount);
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	public String toString() {
		return String.format("Account[id = %s, name = %s, balance = %d]", getID(), getName(), getBalance());
	}

	public static void main(String[] args) {
		Account acc = new Account("Karamyan", "Vika");
		System.out.println(acc);
		Account acc_m = new Account("Karamyan", "Vika", 500000);
		System.out.println(acc_m);
		acc.credit(50000);
		acc.debit(20000);
		acc.transferTo(acc_m, 30000);
		System.out.println(acc.toString());

	}

}
