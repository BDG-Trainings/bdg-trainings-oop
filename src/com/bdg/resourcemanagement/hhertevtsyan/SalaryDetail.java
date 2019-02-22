package com.bdg.resourcemanagement.hhertevtsyan;

import com.bdg.resourcemanagement.hhertevtsyan.enums.SalaryType;

public class SalaryDetail {
    private double salaryAmmount;
    private SalaryType salaryType;
    private String cardNumber;

    public SalaryDetail (final double salaryAmmount, final String cardNumber) {
        this.salaryAmmount = salaryAmmount;
        this.cardNumber = cardNumber;
    }

    public SalaryDetail (final double salaryAmmount) {
        this.salaryAmmount = salaryAmmount;
    }


    public double getSalaryAmmount() {
        return salaryAmmount;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}

