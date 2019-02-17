package com.bdg.vqertikyan.bas;


public final class BankService {
    private Account[] accounts;
    private int index;
    private int maxAccountSize;

    public BankService(final int maxAccountSize) {
        this.maxAccountSize = maxAccountSize;
        this.accounts = new Account[maxAccountSize];
    }


    public Account create(String customerName, String customerSurname, Country country, String street, String phoneNumber, double initialBalance) {
        //Implement this functionality

            Address address = new Address(country, street, phoneNumber);
            Customer customer = new Customer(0, customerName, customerSurname, address);
            AccountBalance accountBalance = new AccountBalance(initialBalance);

            Account account = new Account(customer, accountBalance);

            accounts[index] = account;
        if (maxAccountSize <= index) {
            index++;
            return account;
        }
        return null;

    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        //Implement this functionality
        //find from and to accounts in internal array.
        final Account internalFromAccount = this.findByCustomerName(from.getCustomer().getCustomerName());
        final Account internalToAccount = this.findByCustomerName(to.getCustomer().getCustomerName());

        //Add additional checking here is internal account exist, after perform operations.

        if (internalFromAccount.getAccountBalance().getBalance() >= amount) {
            internalFromAccount.getAccountBalance().withdraw(amount);
            internalToAccount.getAccountBalance().deposit(amount);
            return true;
        }
        return false;

    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        //Implement this functionality

        Account[] filterAccounts = new Account[index];
        for (int i = 0; i < index; i++) {
            Account account = this.accounts[i];
            if (account.getAccountBalance().getBalance() >= balanceFrom && account.getAccountBalance().getBalance() <= balanceTo) {
                filterAccounts[i] = account;
            }
        }
        return filterAccounts;
    }

    public Account findByCustomerName(final String customerName) {
        //Implement this functionality

        for (Account account : accounts) {
            if (account.getCustomer().getCustomerName() == customerName) {
                return account;
            }
        }
        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {
        //Implement this functionality

        Account[] filterAccounts = new Account[accounts.length];
        int i = 0;
        for (Account account : accounts) {
            if (account.getCustomer().getAddress().getCountry() == country) {
                filterAccounts[i] = account;
                i++;
            }
        }
        return filterAccounts;
    }
}
