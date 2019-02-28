package com.bdg.master.bas;


import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BankService {

    private int index;
    private Account[] accounts;

    public BankService(final int maxAccountSize) {
        this.accounts = new Account[maxAccountSize];
    }

    public Account create(String customerName, String customerSurname, Country country, String street, String phoneNumber, double initialBalance) {

        Address address = new Address(country, street, phoneNumber);
        Customer customer = new Customer(customerName, customerSurname, address);
        AccountBalance balance = new AccountBalance(initialBalance);
        Account account = new Account(customer, balance);

        accounts[index] = account;

        return account;
    }


    @Nullable
    public BankService transfer(final Account from, final Account to, final double amount) {

        if (from.getAccountBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
        } else {
            return null;
        }

        return null;
    }

    @Contract(pure = true)
    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        int i = 0;
        Account[] finded = new Account[1];
        double balance;
        for (Account account : accounts) {
            if (account != null) {
                balance = account.getAccountBalance();

            } else {
                balance = 0;
            }
            if (balance >= balanceFrom && balance <= balanceTo) {
                finded[i] = account;
                i++;
            }
        }
        return finded;
    }

    @Nullable
    public Account findByCustomerName(final String customerName) {

        for (Account acount : accounts) {
            if (customerName == acount.getCustomer().getCustomerName()) {
                return acount;
            }
        }
        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {
        Account[] CostumerAccounts = new Account[10];
        int i = 0;
        for (Account account: accounts) {
            if (account != null){
                if (country.getCountryName() == account.getCustomer().getAddress().getCountry().getCountryName()){
                    CostumerAccounts[i] = account;
                    i++;
                }
            }
        }

        return CostumerAccounts;
    }

    @NotNull
    @Contract(pure = true)
    @Override
    public String toString() {
        return "Acounts{" + accounts[index] + "}";
    }
}
