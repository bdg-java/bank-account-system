package com.ashahbazyan.dto;

import com.ashahbazyan.entity.CreditCard;

public class AccountCreationRequest {
    private AccountBalanceCreationRequest accountBalanceCreationRequest;
    private CustomerCreationRequest customerCreationRequest;
    private CreditCardCreationRequest creditCardCreationRequest;

    public AccountCreationRequest(AccountBalanceCreationRequest accountBalanceCreationRequest,
                                  CustomerCreationRequest customerCreationRequest,
                                  CreditCardCreationRequest creditCardCreationRequest) {
        this.accountBalanceCreationRequest = accountBalanceCreationRequest;
        this.customerCreationRequest = customerCreationRequest;
        this.creditCardCreationRequest = creditCardCreationRequest;
    }
}
