package com.bdg.vkaramyan.bankaccountsystem.CRUD;

public class AccountBalanceCreateParameter {
	
	private double balance;

	public AccountBalanceCreateParameter(double balance) {
		
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountBalanaceCreateParameter [balance=" + balance + "]";
	}
	
	

}
