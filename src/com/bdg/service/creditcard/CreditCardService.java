package com.bdg.service.creditcard;


import com.bdg.entity.CreditCard;

/**
 * @author William Arustamyan
 */


public interface CreditCardService {

    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType);

    CreditCard get(int id);
}
