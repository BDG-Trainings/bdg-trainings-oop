package bas;


public final class Account {

    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final Customer customer, final AccountBalance balance) {
        this.customer = customer;
        this.accountBalance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }


    public boolean deposit(final double amount) {
        this.accountBalance.deposit(amount);

        return true;
    }

    public boolean withdraw(final double amount) {
        boolean success = false;
        if (this.accountBalance.getBalance() >= amount) {
            this.accountBalance.withdraw(amount);
            success = true;
        }
        return success;
    }
}
