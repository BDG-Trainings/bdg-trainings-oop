package com.bdg.resourcemanagement.ekirakosyan;

public class SalaryDetail {

    double salaryAmount;
    String cardNumber;
    SalaryType salaryType;

    public SalaryDetail(final double salaryAmount, final String cardNumber) {
        this.salaryAmount = salaryAmount;
        this.cardNumber = cardNumber;
        this.salaryType = SalaryType.CARD;
    }

    public SalaryDetail(final double salaryAmount) {
        this.salaryAmount = salaryAmount;
        this.salaryType = SalaryType.CASH;
        this.cardNumber = null;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    @Override
    public String toString() {
        return "SalaryDetail{" +
                "salaryAmount=" + salaryAmount +
                ", cardNumber='" + cardNumber + '\'' +
                ", salaryType=" + salaryType +
                '}';
    }
}
