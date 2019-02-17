package com.bdg.resourcemanagement.vqertikyan;

public class SalaryDetail {
    private double salaryAmount;
    private SalaryType salaryType;
    private String cardNumber;

    public SalaryDetail(final double salaryAmount, final String cardNumber){
        this.salaryAmount = salaryAmount;
        this.cardNumber = cardNumber;
        this.salaryType = SalaryType.CARD;
    }

    public SalaryDetail(final double salaryAmount){
        this.salaryAmount = salaryAmount;
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

    @Override
    public String toString() {
        return "SalaryDetail{" +
                "salaryAmount=" + salaryAmount +
                ", salaryType=" + salaryType +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
