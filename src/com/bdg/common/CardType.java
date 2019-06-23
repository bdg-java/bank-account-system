package com.bdg.common;


import com.bdg.common.exception.CardTypeNotFoundException;

/**
 * @author William Arustamyan
 */


public enum CardType {

    VISA, MASTERCARD;

    public static CardType findByName(String cardName) {
        CardType found = null;

        for (CardType value : values()) {
            if (value.name().equalsIgnoreCase(cardName)) {
                found = value;
            }
        }
        if (found == null) {
            throw new CardTypeNotFoundException(cardName);
        }
        return found;
    }
}
