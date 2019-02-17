package com.bdg.resourcemanagement.ekirakosyan;

public class SalaryDetail {

    double salaryAmount;
    String cardNumber;
    SalaryType salaryType;

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
        return "SalaryDetail{" +
                "salaryAmount=" + salaryAmount +
                ", cardNumber='" + cardNumber + '\'' +
                ", salaryType=" + salaryType +
                '}';
    }
}
