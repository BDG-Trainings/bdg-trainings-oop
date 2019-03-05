package com.bdg.aiskandaryan.Lesson_111.Entities;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity {
    private final String cardNumber;
    private final int accountNumber;
    private final LocalDate expirationDate;
    private final CardType cardType;


    private static final String NUMERIC_STRING = "0123456789";
    public static String randomNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()* NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public CreditCard(final int id, final int accountNumber, final LocalDate expirationDate, final CardType cardType) {
        super(id);
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.cardNumber = randomNumeric(16);
    }

    public String getCardNumber() {
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
}
