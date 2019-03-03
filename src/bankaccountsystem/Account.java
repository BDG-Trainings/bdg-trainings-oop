package bankaccountsystem;

public class Account {

    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public Account(bankaccountsystem.Customer customer, bankaccountsystem.CreditCard creditCard, bankaccountsystem.AccountBalance accountBalance) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }
}
