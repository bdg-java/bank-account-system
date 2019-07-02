package com.ashahbazyan.dto;

import com.ashahbazyan.common.CardType;

public class CreditCardCreationRequest {
    public CardType cardType;

    public CreditCardCreationRequest(CardType cardType) {
        this.cardType = cardType;
    }
}
