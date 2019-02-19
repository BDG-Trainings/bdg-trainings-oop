package com.bdg.agalayan.bas;


public final class BankService {

    private Account[] accounts;
    private int index;
    private int currentAccountSize = 0;

    public BankService(final int maxAccountSize) {
        this.accounts = new Account[maxAccountSize];
    }

    public Account create(String customerName, String customerSurname,
                          Country country, String street,
                          String phoneNumber, double initialBalance) {
        Address a = new Address(country, street, phoneNumber);
        Customer c = new Customer(customerName, customerSurname, a, index);
        index++;
        AccountBalance balance = new AccountBalance(initialBalance);
        Account account = new Account(c, balance);


        //Move to top we can check before and after process account creation
        if (currentAccountSize < accounts.length) {
            accounts[currentAccountSize] = account;
            currentAccountSize++;
            return account;
        }

        return null;
    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        boolean t = false;
        if (from.getAccountBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            t = true;
        }
        return t;
    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        int count = 0;
        for (int i = 0; i < currentAccountSize; i++) {
            if (accounts[i].getAccountBalance() > balanceFrom && accounts[i].getAccountBalance() < balanceTo) {
                count++;
            }
        }
        Account[] allAccountWithBalanceRange = new Account[count];
        int k = 0;
        for (int i = 0; i < currentAccountSize; i++) {
            if (accounts[i].getAccountBalance() > balanceFrom && accounts[i].getAccountBalance() < balanceTo) {
                allAccountWithBalanceRange[k] = accounts[i];
                k++;
            }

        }
        return allAccountWithBalanceRange;

    }

    public Account findByCustomerName(final String customerName) {
        for (int i = 0; i < currentAccountSize; i++) {
            if (accounts[i].getCustomer().getCustomerName().equals(customerName)) {
                return accounts[i];
            }
        }

        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {
        int count = 0;
        for (int i = 0; i < currentAccountSize; i++) {
            if (accounts[i].getCustomer().getAddress().getCountry().equals(country)) {
                count++;
            }
        }
        Account[] allAccountsByCountry = new Account[count];
        int k = 0;
        for (int i = 0; i < currentAccountSize; i++) {
            if (accounts[i].getCustomer().getAddress().getCountry().equals(country)) {
                allAccountsByCountry[k] = accounts[i];
                k++;
            }
        }
        return allAccountsByCountry;


    }
}
