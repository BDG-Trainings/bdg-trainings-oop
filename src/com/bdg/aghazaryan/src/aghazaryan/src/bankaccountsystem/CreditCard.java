package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem;

import com.bdg.aghazaryan.src.aghazaryan.src.classexercises.Date;

public class CreditCard {

    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;



    public CreditCard (int accountNumber, Date expirationDate, CardType cardType ){
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

}
