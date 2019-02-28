package com.bdg.osahakyan.bankaccountsystem;

import com.bdg.osahakyan.bankaccountsystem.enums.CardType;
import com.bdg.osahakyan.date.Date;

import java.util.Random;

public class CreditCard {

    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;

    public CreditCard(String cardNumber, int accountNumber, Date expirationDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        String CardNumber = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder cn = new StringBuilder();
        Random r = new Random();
        while (cn.length() < 10){
            int index = (int) (r.nextFloat() * CardNumber.length());
            cn.append(CardNumber.charAt(index));
        }
        String cnString = cn.toString();
        return cnString;
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
