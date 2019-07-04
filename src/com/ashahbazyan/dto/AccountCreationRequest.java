package com.ashahbazyan.dto;

import com.ashahbazyan.entity.CreditCard;

public class AccountCreationRequest {
    public AccountBalanceCreationRequest accountBalanceCreationRequest;
    public CustomerCreationRequest customerCreationRequest;
    public CreditCardCreationRequest creditCardCreationRequest;

    public AccountCreationRequest(AccountBalanceCreationRequest accountBalanceCreationRequest,
                                  CustomerCreationRequest customerCreationRequest,
                                  CreditCardCreationRequest creditCardCreationRequest) {
        this.accountBalanceCreationRequest = accountBalanceCreationRequest;
        this.customerCreationRequest = customerCreationRequest;
        this.creditCardCreationRequest = creditCardCreationRequest;
    }
}
