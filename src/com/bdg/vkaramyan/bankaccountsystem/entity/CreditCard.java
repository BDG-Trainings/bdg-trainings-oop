package com.bdg.vkaramyan.bankaccountsystem.entity;

import java.time.LocalDate;
import java.util.UUID;

import com.bdg.vkaramyan.bankaccountsystem.common.CardType;

public class CreditCard extends AbstractBankEntity {

	private String cardNumber = "0123456789";
	private int accountNumber;
	private LocalDate expirationDate;
	private CardType cardType;

	public CreditCard(final int id, final String cardNumber, final int accountNumber, final LocalDate expirationDate,
			final CardType cardType) {

		super(id);
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.expirationDate = expirationDate;
		this.cardType = cardType;
	}

	public String getCardNumber() {
		UUID uuid = UUID.fromString(cardNumber);
		cardNumber = uuid.toString();
		return cardNumber;
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public LocalDate getExpirationDate() {
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

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", accountNumber=" + accountNumber + ", cardType=" + cardType + "]";
	}
	
}
