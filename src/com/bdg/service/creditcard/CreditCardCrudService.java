package com.bdg.service.creditcard;


import com.bdg.common.CardType;
import com.bdg.common.exception.CreditCardNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.CreditCard;
import com.bdg.storage.Storage;
import com.bdg.storage.creditcard.CreditCardStorage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author William Arustamyan
 */


public class CreditCardCrudService implements CreditCardService {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final Storage creditCardStorage = new CreditCardStorage();


    @Override
    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType) {
        final LocalDate date = LocalDate.parse(expDate, formatter);
        final CardType type = CardType.findByName(cardType);
        final CreditCard creditCard = new CreditCard(cardNumber, accountNumber, date, type);
        if (creditCardStorage.add(creditCard)) {
            return creditCard;
        }
        return null;
    }

    @Override
    public CreditCard get(int id) {
        AbstractBankEntity card = creditCardStorage.get(id);
        if (card == null) {
            throw new CreditCardNotFoundException(id);
        }
        return (CreditCard) card;
    }
}
