package bas;

public final class Account {

    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final Customer customer, final AccountBalance Balance) {
        this.customer = customer;
        this.accountBalance = Balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void deposit(final double amount) {
        deposit(amount);
    }

    public boolean withdraw(final double amount) {
        if(this.accountBalance >= amount) {
         return true;
        }
        return false;
    }
}
