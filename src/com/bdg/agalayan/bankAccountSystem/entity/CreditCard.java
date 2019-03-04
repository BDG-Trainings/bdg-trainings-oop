package com.bdg.agalayan.bankAccountSystem.entity;



import com.bdg.agalayan.bankAccountSystem.enums.CardType;

import java.time.LocalDate;
import java.util.UUID;

public class CreditCard extends AbstractBankEntity {
    private String cardNumber;
    private int accountNumber;
    private LocalDate expirationDate;
    private CardType cardType;



    public CreditCard(int id,int accountNumber, LocalDate expirationDate, CardType cardType) {
        super(id);

        cardNumber=UUID.randomUUID().toString();
        this.accountNumber=accountNumber;
        this.cardType=cardType;
        this.expirationDate=expirationDate;
    }
    public String generateRandom(){
        String uuid=UUID.randomUUID().toString();
        return UUID.randomUUID().toString();
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

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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
       System.out.println(card.expirationDate);
    }
}
