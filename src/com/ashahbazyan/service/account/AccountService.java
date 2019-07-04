package com.ashahbazyan.service.account;

import com.ashahbazyan.common.Country;
import com.ashahbazyan.dto.*;
import com.ashahbazyan.entity.*;
import com.ashahbazyan.exceptions.AccountNotFoundException;
import com.ashahbazyan.service.BankAccountBaseService;
import com.ashahbazyan.service.address.AddressService;
import com.ashahbazyan.service.creditcard.CreditCardService;
import com.ashahbazyan.service.customer.CustomerService;
import com.ashahbazyan.storage.MemoryStorage;
import com.ashahbazyan.storage.Storage;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {
    private Storage<Account> accountStorage = new MemoryStorage<>(STORAGE_SIZE);
    private BankAccountBaseService<Customer, CustomerCreationRequest> customerService = new CustomerService();
    private BankAccountBaseService<CreditCard, CreditCardCreationRequest> creditCardService = new CreditCardService();
    private BankAccountBaseService<AccountBalance, AccountBalanceCreationRequest> accountBalanceService = new AccountBalanceService();

    @Override
    public Account create(AccountCreationRequest request) {
        Customer customer = customerService.create(request.customerCreationRequest);
        CreditCard creditCard = creditCardService.create(request.creditCardCreationRequest);
        AccountBalance accountBalance = accountBalanceService.create(request.accountBalanceCreationRequest);
        Account account = new Account(customer, creditCard, accountBalance);
        accountStorage.add(account);
        return account;
    }

    @Override
    public Account get(int id) {
        Account account = accountStorage.get(id);
        if (account == null) {
            throw new AccountNotFoundException(id);
        }
        return account;
    }

    @Override
    public Account remove(int id) {
        Account account = accountStorage.remove(id);
        if (account == null) {
            throw new AccountNotFoundException(id);
        }
        return account;
    }
}