package com.bdg.service.creditcard;

import com.bdg.common.exception.AccountNotFoundNotExeption;
import com.bdg.entity.*;
import com.bdg.storage.account.AccountStorage;

import javax.security.auth.login.AccountNotFoundException;
import java.time.LocalDate;

public class AcoountCurdService implements AccountService {
    private final AccountStorage addressStorage = new AccountStorage();
    public int currentIndex = 0;

    public Account create(Customer customer, AccountDetails accountDetails){
        final Account accountes = new Account(customer, accountDetails );
        if(addressStorage.add(accountes)){
            currentIndex++;
            return accountes;
        }
        return null;
    }

    public Account get(int id) {
        AbstractBankEntity accoutes = addressStorage.get(id);
        if (accoutes == null) {
            throw new AccountNotFoundNotExeption(id);
        }
            return (Account) accoutes;

    }


    public Account remove(int id) {
        AbstractBankEntity accountes = addressStorage.get(id);
        accountes.setDeleted(LocalDate.now());
        currentIndex--;
        if (accountes == null) {
            throw new AccountNotFoundNotExeption(id);
        }
        return (Account) accountes;
    }
}
