package com.bdg.agalayan.bankAccountSystem.entity;



import com.bdg.agalayan.bankAccountSystem.enums.CardType;

import java.time.LocalDate;
import java.util.UUID;

public class CreditCard extends AbstractBankEntity {
    private String cardNumber;
    private int accountNumber;
    private LocalDate expirationDate;
    private CardType cardType;


    //id :(
    public CreditCard(int id, int accountNumber, LocalDate expirationDate, CardType cardType) {
        super(id);
        cardNumber=this.generateString();
        this.accountNumber=accountNumber;
        this.cardType=cardType;
        this.expirationDate=expirationDate;
    }

    //Not meaningful method name
    public String generateString() {
        //unusable reference replace with method return << return UUID.randomUUID().toString(); >>
        String uuid = UUID.randomUUID().toString();
        return  uuid;
    }

    @Override
    public LocalDate getCreatedDate() {
        return super.getCreatedDate();
    }

    @Override
    public LocalDate getUpdatedDate() {
        return super.getUpdatedDate();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setCreatedDate(LocalDate createdDate) {
        super.setCreatedDate(createdDate);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setUpdatedDate(LocalDate updatedDate) {
        super.setUpdatedDate(updatedDate);
    }

    public CardType getCardType() {
        return cardType;
    }

    public LocalDate getExpirationDate() {
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


    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static void main(String[] args) {
       CreditCard card= new CreditCard(1,12,LocalDate.now(),CardType.CLASSIC);
       System.out.println(card.getCardNumber());
    }
}
