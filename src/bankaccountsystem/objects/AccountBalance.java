package bankaccountsystem.objects;

import bankaccountsystem.entity.AbstractBASEntity;

public class AccountBalance extends AbstractBASEntity {

    private double balance;

    public AccountBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
