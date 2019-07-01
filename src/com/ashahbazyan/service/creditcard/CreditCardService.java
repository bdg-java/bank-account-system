package com.ashahbazyan.service.creditcard;

import com.ashahbazyan.dto.CreditCardCreationRequest;
import com.ashahbazyan.entity.CreditCard;
import com.ashahbazyan.service.BankAccountBaseService;

public class CreditCardService  implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {
    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        return null;
    }
}
