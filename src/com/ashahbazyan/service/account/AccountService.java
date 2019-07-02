package com.ashahbazyan.service.account;

import com.ashahbazyan.dto.AccountCreationRequest;
import com.ashahbazyan.entity.Account;
import com.ashahbazyan.service.BankAccountBaseService;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {

    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }

    @Override
    public Account get(int id) {
        return null;
    }

    @Override
    public Account remove(int id) {
        return null;
    }
}
