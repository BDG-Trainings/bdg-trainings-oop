package com.bdg.vqertikyan.bankaccountsystem.entity;


import com.bdg.vqertikyan.bankaccountsystem.common.CardType;

import java.time.LocalDate;

public final class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountId;
    private LocalDate expirationDate;
    private CardType cardType;

    public CreditCard(final int accountId, final LocalDate expirationDate, final CardType cardType) {
        this.accountId = accountId;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(final String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(final int accountId) {
        this.accountId = accountId;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(final LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(final CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", accountId=" + accountId +
                ", expirationDate=" + expirationDate +
                ", cardType=" + cardType +
                ", id=" + id +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", deletedDate=" + deletedDate +
                '}';
    }
}
