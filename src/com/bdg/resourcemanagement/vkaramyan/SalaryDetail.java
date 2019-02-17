package com.bdg.resourcemanagement.vkaramyan;

public class SalaryDetail {
	
	private double salaryAmount;
	private SalaryType salaryType;
	private String cardNumber;
	
	public SalaryDetail(final double salaryAmount, final String cardNumber) {
		this.salaryAmount = salaryAmount;
		this.salaryType = SalaryType.CARD;
		this.cardNumber = cardNumber;
	}
	
	public SalaryDetail(final double amount) {
        this.salaryAmount = amount;
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

	@Override
	public String toString() {
		return "SalaryDetail [salaryAmount=" + salaryAmount + ", salaryType=" + salaryType + ", cardNumber="
				+ cardNumber + "]";
	}


}
