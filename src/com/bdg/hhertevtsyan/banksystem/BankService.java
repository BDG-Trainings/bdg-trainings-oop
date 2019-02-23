package com.bdg.hhertevtsyan.banksystem;

public final class BankService {
    private int currentAccountSize = 0;
    private  int customersId =0;
    private Account[] accounts;

    public BankService(final int maxAccountSize) {
        this.accounts = new Account[maxAccountSize];
    }

    public int getMaxAccountSize () {
        return accounts.length;
    }

    public Account create(int accountNumber, String customerName, String customerSurname, Country country, String city, String street, String phoneNumber, double initialBalance) {
        if (currentAccountSize<accounts.length) {
           Customer newCustomer = new Customer(customersId,customerName,customerSurname, new Address(country, city, street, phoneNumber));
           accounts[currentAccountSize] = new Account(accountNumber, newCustomer, new AccountBalance(initialBalance));
           currentAccountSize ++;
           customersId ++;

           return accounts[currentAccountSize-1];
        } else {
        return null; }
    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        boolean transferIsComplete = false;
        for (int i = 0; i < currentAccountSize; i++) {
            if (from.getAccountNumber() == accounts[i].getAccountNumber()) {
                for (int j = 0; j < currentAccountSize; j++) {
                    if (to.getAccountNumber() == accounts[j].getAccountNumber()) {
                        accounts[i].withdraw(amount);
                        accounts[j].deposit(amount);
                        transferIsComplete = true;
                    }
                }
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
        for (int i = 0; i< accounts.length; i++) {
            if (accounts[i].getCustomer().getCustomerName() == customerName && accounts[i].getCustomer().getCustomerSurname() == customerSurename)
                return accounts[i];
        }
        System.out.println("Customer not found");
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

    public int getCurrentAccountSize() {
        return currentAccountSize;
    }
}
