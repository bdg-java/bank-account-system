package com.bdg.entity;


import com.bdg.common.enums.CardType;

import java.time.LocalDate;

/**
 * @author William Arustamyan
 */


public final class CreditCard extends AbstractBankEntity {
    /**
     * Autoincrement id for account
     */
    private int accountNumber;
    /**
     * Random generated 16 character long card number
     */
    private String cardNumber;
    private LocalDate expDate;
    private CardType cardType;

    public CreditCard(String cardNumber, int accountNumber, LocalDate expDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expDate = expDate;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", accountNumber=" + accountNumber +
                ", expDate=" + expDate +
                ", cardType=" + cardType +
                ", id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                ", deleted=" + deleted +
                '}';
    }
}
