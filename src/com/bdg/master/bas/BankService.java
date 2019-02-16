package com.bdg.master.bas;


public final class BankService {

    private int index;
    private Account [] accounts;


    public BankService(final int maxAccountSize) {
        this.accounts = new Account[maxAccountSize];
    }

    public Account create(String customerName, String customerSurname, Country country, String street, String phoneNumber, double initialBalance) {

            Address         address  = new Address(country,street,phoneNumber);
            Customer        customer = new Customer(customerName,customerSurname,address);
            AccountBalance  balance  = new AccountBalance(initialBalance);
            Account         account  = new Account(customer,balance);

            accounts[index] = account;

        return account;
    }


    public BankService transfer(final Account from, final Account to, final double amount) {

        if (from.getAccountBalance() >= amount){
                from.withdraw(amount);
                to.deposit(amount);
            }else {
            return null;
        }

        return null;
    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        //Implement this functionality
        return null;
    }

    public Account findByCustomerName(final String customerName) {
        for (Account acount: accounts) {
            if (customerName == acount.getCustomer().getCustomerName()){
                return acount;
            }
        }
        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {
        //Implement this functionality
        return null;
    }

    @Override
    public String toString() {
        return "Acounts{"+
                "";
    }
}
