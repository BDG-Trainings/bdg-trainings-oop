package com.bdg.resourcemanagement.vqertikyan;

public class SalaryDetail {
    private double salaryAmount;
    private SalaryType salaryType;
    private String cardNumber;

    public SalaryDetail(final double salaryAmount, final SalaryType salaryType, final String cardNumber){
        this.salaryAmount = salaryAmount;
        this.salaryType = salaryType;
        this.cardNumber = cardNumber;
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
