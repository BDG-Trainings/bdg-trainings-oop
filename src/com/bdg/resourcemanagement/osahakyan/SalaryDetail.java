package com.bdg.resourcemanagement.osahakyan;

public class SalaryDetail {

    private double salaryAmount;
    private SalaryType salaryType;
    private String cardNumber;

    enum SalaryType{
        Card(),
        Cash();
    }

    public SalaryDetail(double salaryAmount, String cardNumber, SalaryType salaryType) {
        this.salaryAmount = salaryAmount;
        this.cardNumber = cardNumber;
        this.salaryType = salaryType;
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
        return "SalaryDetail(" +
                salaryAmount + "," +
                cardNumber + "," +
                salaryType +  ")";
    }
}
