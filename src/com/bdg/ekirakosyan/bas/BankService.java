package bas;


public final class BankService {

    private Account[] accounts;

    public BankService(final int maxAccountSize) {
        this.accounts = new Account[maxAccountSize];
    }

    public Account create(String customerName, String customerSurname, Country country, String street, String phoneNumber, double initialBalance) {
        //Implement this functionality
        Address address = new Address(country, street, phoneNumber);
        Customer customer = new Customer(customerName, customerSurname, address);
        AccountBalance balance = new AccountBalance(initialBalance);
        Account account = new Account(customer, balance);
        if(account !=null ) {
            return account;
        }
        return null;
    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        //Implement this functionality
        from.deposit(amount);
        to.withdraw(amount);

        return false;
    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        //Implement this functionality
        int lenght = 0;
        for (int i=0; i<accounts.length; i++){
            if(accounts[i].getAccountBalance().getBalance() >= balanceFrom && accounts[i].getAccountBalance().getBalance() <= balanceTo){
                lenght++;
            }
        }

        Account[] accountsByRange = new Account[lenght];
        for (int i=0; i<accounts.length; i++){
            if(accounts[i].getAccountBalance().getBalance() >= balanceFrom && accounts[i].getAccountBalance().getBalance() <= balanceTo){
                accountsByRange[i] = accounts[i];
            }
        }
        if(accountsByRange != null){
            return accountsByRange;
        }
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
