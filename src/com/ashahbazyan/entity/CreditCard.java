package com.ashahbazyan.entity;

import com.ashahbazyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends BankEntity {
    private int accountId;
    private String cardNumber;
    private LocalDate expDate;
    private int cvvCode;
    private CardType cardType;

}
