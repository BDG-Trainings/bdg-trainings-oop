package com.bdg.hhertevtsyan.bankaccountsystem.entity;

import com.bdg.hhertevtsyan.Date;
import com.bdg.hhertevtsyan.bankaccountsystem.common.CardType;

public class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;

    public CreditCard(final int id, final int accountNumber, final Date expirationDate, final CardType cardType ) {
        super(id);
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
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

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
