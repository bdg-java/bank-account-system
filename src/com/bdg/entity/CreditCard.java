package com.bdg.entity;


import com.bdg.common.enums.CardType;

import java.time.LocalDate;

/**
 * @author William Arustamyan
 */


public final class CreditCard extends AbstractBankEntity {

    private int accountNumber;
    /**
     * Random generated 16 character long card number
     */
    private String cardNumber;
    private LocalDate expDate;
    private CardType cardType;
    private byte active;

    public CreditCard(String cardNumber, int accountNumber, LocalDate expDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expDate = expDate;
        this.cardType = cardType;
        this.active = 1;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
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
