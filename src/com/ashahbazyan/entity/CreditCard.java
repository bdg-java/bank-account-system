package com.ashahbazyan.entity;

import com.ashahbazyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends BankEntity {

    private String cardNumber;//auto generated 16 character long string
    private int accountId;
    private LocalDate expDate;
    private int cvvCode;
    private CardType cardType;

    public CreditCard(int accountId,LocalDate expDate, int cvvCode, CardType cardType) {
        this.accountId = accountId;
        this.expDate = expDate;
        this.cvvCode = cvvCode;
        this.cardType = cardType;
    }
}
