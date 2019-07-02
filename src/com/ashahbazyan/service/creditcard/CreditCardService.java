package com.ashahbazyan.service.creditcard;

import com.ashahbazyan.dto.CreditCardCreationRequest;
import com.ashahbazyan.entity.CreditCard;
import com.ashahbazyan.exceptions.CreditCardNotFoundException;
import com.ashahbazyan.service.BankAccountBaseService;
import com.ashahbazyan.storage.MemoryStorage;
import com.ashahbazyan.storage.Storage;

import java.time.LocalDate;

public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {

    private Storage<CreditCard> creditCardStorage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        System.out.println(LocalDate.now().plusYears(4));
        CreditCard creditCard = new CreditCard(12, LocalDate.now().plusYears(4),
                CreditCardNumberGenerator.generateCvvCode(), request.cardType);
        creditCardStorage.add(creditCard);

        return creditCard;
    }

    @Override
    public CreditCard get(int id) {
        CreditCard creditCard = creditCardStorage.get(id);
        if (creditCardStorage.get(id) == null) {
            throw new CreditCardNotFoundException(id);
        }
        return creditCard;
    }

    @Override
    public CreditCard remove(int id) {
        CreditCard creditCard = creditCardStorage.remove(id);
        if (creditCard == null) {
            throw new CreditCardNotFoundException(id);
        }
        return creditCard;
    }
}
