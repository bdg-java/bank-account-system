package com.bdg;


import com.bdg.service.creditcard.CreditCardCrudService;
import com.bdg.service.creditcard.CreditCardNumberGenerator;
import com.bdg.service.creditcard.CreditCardService;

/**
 * @author William Arustamyan
 */


public class BankAccountSystem {


    public static void main(String[] args) {
        CreditCardService service = new CreditCardCrudService();
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        service.create(generator.generate(), 10, "10-10-2020", "VISA");
        System.out.println(service.get(1));

    }
}
