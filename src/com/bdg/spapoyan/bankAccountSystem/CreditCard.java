package com.bdg.spapoyan.bankAccountSystem;

import com.bdg.spapoyan.bankAccountSystem.entity.AbstractBankEntity;
import com.bdg.spapoyan.bankAccountSystem.enumBankAccountSystem.CardType;

public class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;


    public CreditCard(final int id, final int accountNumber, Date expDate, CardType cardType) {
        super(id);
        this.accountNumber = accountNumber;
        this.expirationDate = expDate;
        this.cardType = cardType;
    }

    public String cardNumber(){
        int a = 0, b = 9999;
        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);
        int random_number3 = a + (int) (Math.random() * b);
        int random_number4 = a + (int) (Math.random() * b);
        System.out.println(+random_number1 + " " + random_number2 + " " + random_number3 + " " + random_number4);
        return cardNumber;
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
