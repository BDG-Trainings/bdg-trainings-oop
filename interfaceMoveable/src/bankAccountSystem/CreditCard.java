package bankAccountSystem;

import bankAccountSystem.enums.CardType;

import java.util.Date;

public class CreditCard extends AbstractBankEntity {
    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;

    public CreditCard(int accountNumber, Date expirationDate, CardType cardType) {
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
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
