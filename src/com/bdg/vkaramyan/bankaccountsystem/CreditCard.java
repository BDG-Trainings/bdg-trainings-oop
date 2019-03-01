package com.bdg.vkaramyan.bankaccountsystem;

import java.util.Date;
import java.util.Random;

public class CreditCard extends AbstractBankEntity {

	private String cardNumber = "0123456789";
	private int accountNumber;
	private Date expirationDate;
	private CardType cardType;

	public CreditCard(final int id, final String cardNumber, final int accountNumber, final Date expirationDate,
			final CardType cardType) {

		super(id);
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.expirationDate = expirationDate;
		this.cardType = cardType;
	}

	public String getCardNumber() {
		Random random = new Random();
		random.nextInt();
		return cardNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", accountNumber=" + accountNumber + ", expirationDate="
				+ expirationDate + ", cardType=" + cardType + "]";
	}

}
