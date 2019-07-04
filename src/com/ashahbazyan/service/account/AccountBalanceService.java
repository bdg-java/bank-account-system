package com.ashahbazyan.service.account;

import com.ashahbazyan.dto.AccountBalanceCreationRequest;
import com.ashahbazyan.entity.AccountBalance;
import com.ashahbazyan.exceptions.AccountBalanceNotFoundException;
import com.ashahbazyan.service.BankAccountBaseService;
import com.ashahbazyan.storage.MemoryStorage;
import com.ashahbazyan.storage.Storage;

public class AccountBalanceService implements BankAccountBaseService<AccountBalance, AccountBalanceCreationRequest> {
   private Storage<AccountBalance> accountBalanceStorage= new MemoryStorage<>(STORAGE_SIZE);
    @Override
    public AccountBalance create(AccountBalanceCreationRequest request) {
        AccountBalance accountBalance = new AccountBalance(request.amount);
        accountBalanceStorage.add(accountBalance);
        return accountBalance;
    }

    @Override
    public AccountBalance get(int id) {
        AccountBalance accountBalance = accountBalanceStorage.get(id);
        if (accountBalance == null) {
            throw new AccountBalanceNotFoundException(id);
        }
        return accountBalance;
    }

    @Override
    public AccountBalance remove(int id) {
        AccountBalance accountBalance = accountBalanceStorage.remove(id);
        if (accountBalance == null) {
            throw new AccountBalanceNotFoundException(id);
        }
        return accountBalance;
    }
}
