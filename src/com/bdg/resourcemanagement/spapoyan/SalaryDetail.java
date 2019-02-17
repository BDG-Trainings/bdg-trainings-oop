package com.bdg.resourcemanagement.spapoyan;

public final class SalaryDetail {

    private double salaryAmount;
    private SalaryType salaryType;
    private String cardNumber;

    public SalaryDetail(final double amount, String cardNumber) {
        this.salaryAmount = amount;
        this.cardNumber = cardNumber;
        this.salaryType = SalaryType.CARD;
    }

    public SalaryDetail(final double amount) {
        this.salaryAmount = amount;
        this.cardNumber = null;
        this.salaryType = SalaryType.CASH;

    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
