package com.bdg.akarapetyan.bas;

public final class BankService {

    private int accountId = 0;
    private int maxSize = 100;
    private Account[] accounts = new Account[maxSize];

    public BankService() {
    }

    public Account create(String customerName, String customerSurname, Country country, String street, String phoneNumber, double initialBalance) {
        accountId = accountId++;
        if (accountId <= maxSize){
            Address address = new Address(country,street,phoneNumber);
            Customer customer_draft = new Customer();
            Customer customer = new Customer (customer_draft.getCustomerId()+1, customerName, customerSurname, address);
            AccountBalance balance = new AccountBalance(initialBalance);
            Account account = new Account(customer, balance);
            this.accounts [accountId] = account;
            return account;
        }
        return null;
    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        //Implement this functionality
        return false;
    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        //Implement this functionality
        return null;
    }

    public Account findByCustomerName(final String customerName) {
        //Implement this functionality
        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {
        //Implement this functionality
        return null;
    }
}

