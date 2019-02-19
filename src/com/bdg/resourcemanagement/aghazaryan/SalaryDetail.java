package com.bdg.resourcemanagement.aghazaryan;

public class SalaryDetail {

    private double salaryAmount;
    private SalaryType salaryType;
    private String cardNumber;

    public SalaryDetail(final double amount, final String cardNumber) {
        this.salaryAmount = salaryAmount;
        this.cardNumber = cardNumber;
        this.salaryType = SalaryType.CARD;
    }

    public SalaryDetail( double amount) {
        this.salaryAmount = salaryAmount;
        this.salaryType = SalaryType.CASH;
        this.cardNumber = null;
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