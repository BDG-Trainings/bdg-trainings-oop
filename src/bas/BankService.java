package bas;

public class BankService {

    private Account[] accounts;

    public BankService(final int maxAccountSize) {
        this.accounts = new Account[maxAccountSize];
    }

    public Account create(String customerName, String customerSurname, Country country, String street, String phoneNumber, double initialBalance) {
        //Implement this functionality
        Address address = new Address(country, street, phoneNumber);
        Customer customer = new Customer(customerName, customerSurname, address);
        AccountBalance accountBalance = new AccountBalance(initialBalance);

        Account account = new Account(customer, accountBalance);
        return account;
    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        //Implement this functionality
        from.withdraw(amount);
        to.deposit(amount);
        return false;
    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        //Implement this functionality

        return null;
    }

    public Account findByCustomerName(final String customerName) {
        //Implement this functionality
        for (int i = 0; i < accounts.length; i++){
            if(accounts[i].getCustomer().getCustomerName().contentEquals(customerName)){
                return accounts[i];
            }
        }
        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {
        //Implement this functionality
        return null;
    }
}
