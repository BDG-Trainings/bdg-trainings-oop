package com.bdg.agalayan.bankAccountSystem;

import com.bdg.agalayan.lessons_07.Date;

public class CreditCard extends AbstractBankEntity {
    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;


    public CreditCard(int id, String cardNumber, int accountNumber, Date expirationDate, CardType cardType) {
        super(id);
        this.accountNumber=accountNumber;
        this.cardNumber=cardNumber;
        this.cardType=cardType;
        this.expirationDate=expirationDate;
    }

    @Override
    public Date getCreatedDate() {
        return super.getCreatedDate();
    }

    @Override
    public Date getUpdatedDate() {
        return super.getUpdatedDate();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        super.setCreatedDate(createdDate);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
        super.setUpdatedDate(updatedDate);
    }

    public CardType getCardType() {
        return cardType;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
