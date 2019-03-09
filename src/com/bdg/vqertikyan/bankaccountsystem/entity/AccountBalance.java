package com.bdg.vqertikyan.bankaccountsystem.entity;


public final class AccountBalance extends AbstractBankEntity {
    private double amount;

    public AccountBalance(final double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(final double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AccountBalance{" +
                "amount=" + amount +
                ", id=" + id +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", deletedDate=" + deletedDate +
                '}';
    }
}
