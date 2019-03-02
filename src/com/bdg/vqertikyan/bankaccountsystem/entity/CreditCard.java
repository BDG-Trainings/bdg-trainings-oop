package com.bdg.vqertikyan.bankaccountsystem.entity;

import com.bdg.vqertikyan.bankaccountsystem.common.CardType;

import java.util.Date;

public class CreditCard extends AbstractBankEntity {
    private String cardNumber;
    private int accountNumber;
    private Date expiration;
    private CardType cardType;

    public CreditCard(String cardNumber, int accountNumber, Date expiration, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expiration = expiration;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", accountNumber=" + accountNumber +
                ", expiration=" + expiration +
                ", cardType=" + cardType +
                '}';
    }
}