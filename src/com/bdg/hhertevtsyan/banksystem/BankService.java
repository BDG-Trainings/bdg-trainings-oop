package com.bdg.hhertevtsyan.banksystem;

public final class BankService {
    private int currentAccountSize = 0;
    private  Customer [] customers;
    private Account[] accounts;

    public BankService(final int maxAccountSize) {
        this.accounts = new Account[maxAccountSize];
    }

    public Account create(String customerName, String customerSurname, Country country, String city, String street, String phoneNumber, double initialBalance) {
        if (currentAccountSize<accounts.length) {
           Customer newCustomer = new Customer(customers.length+1,customerName,customerSurname, new Address(country, city, street, phoneNumber));
           accounts[currentAccountSize] = new Account(90005000, newCustomer, new AccountBalance(initialBalance));
           currentAccountSize = currentAccountSize+1;
           return accounts[currentAccountSize-1];
        } else {
        return null; }
    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        boolean transferIsComplete = false;
        for (int i = 0; i < accounts.length; i++) {
            if (from.getAccountNumber() == accounts[i].getAccountNumber()) {
                from.withdraw(amount);
                accounts[i].deposit(amount);
                transferIsComplete = true;
            }
        }
        return transferIsComplete;
    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        int numberOfAccountsInRange = 0;
        Account [] accountsInRange = new Account[accounts.length];
        for (int i =0; i < accounts.length; i++) {
            if(accounts[i].getBalance() >= balanceFrom && accounts[i].getBalance() <= balanceTo ) {
                accountsInRange[numberOfAccountsInRange] = accounts[i];
                numberOfAccountsInRange++;
            }
        }
        return accountsInRange;
    }

    public Account findByCustomerName(final String customerName, final String customerSurename) {
        //Implement this functionality
        for (int i = 0; i< accounts.length; i++) {
            if (accounts[i].getCustomer().getCustomerName() == customerName && accounts[i].getCustomer().getCustomerSurname() == customerSurename)
                return accounts[i];
        }
        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {
        int numberOfAccountsByCountry = 0;
        Account [] accountsByCountry = new Account[accounts.length];
        for (int i =0; i < accounts.length; i++) {
            if(accounts[i].getCustomer().getAddress().getCountry() == country ) {
                accountsByCountry[numberOfAccountsByCountry] = accounts[i];
                numberOfAccountsByCountry++;
            }
        }
        return accountsByCountry;
    }
}
