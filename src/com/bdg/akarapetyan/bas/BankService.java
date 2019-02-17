package com.bdg.akarapetyan.bas;

public final class BankService {

    private int accountId = 0;
    private int maxSize = 20;
    private Account[] accounts = new Account[maxSize];

    public BankService() {
    }

    public Account create(int customerID, String customerName, String customerSurname, Country country, String street, String phoneNumber, double initialBalance) {

        if (accountId <= maxSize){
            Address address = new Address(country,street,phoneNumber);
            Customer customer = new Customer (customerID, customerName, customerSurname, address);
            AccountBalance balance = new AccountBalance(initialBalance);
            Account account = new Account(customer, balance);
            this.accounts [accountId] = account;
            this.accountId++;
            return account;
        }
        return null;
    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        if (from.withdraw(amount)){
            to.deposit(amount);
            return true;
        }
        return false;
    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        //Implement this functionality
        return null;
    }

    public Account findByCustomerName(final String customerName) {
        for (int i=0; i<accounts.length; i++){
            if (accounts[i].getCustomer().getCustomerName() == customerName){
                return accounts[i];
            }
        }
        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {

        Account [] account = new Account[accounts.length];
        int j=0;
        for (int i=0; i<accounts.length; i++){
            if (accounts[i] != null && accounts[i].getCustomer().getAddress().getCountry() == country){
                account[j]=accounts[i];
                j++;
            }
        }
        Account [] accountUpdate = new Account[j];
        for (int i=0; i<j; i++){
            accountUpdate[i]=account[i];
        }
        return accountUpdate;
    }

    public void toString(Account [] account) {

        for (Account accountNew : account){
            System.out.println(accountNew.toString());
        }
    }
}

