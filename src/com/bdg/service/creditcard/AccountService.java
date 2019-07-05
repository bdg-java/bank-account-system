package com.bdg.service.creditcard;

import com.bdg.entity.Account;
import com.bdg.entity.AccountBalance;
import com.bdg.entity.AccountDetails;
import com.bdg.entity.Customer;

interface AccountService {
    Account create(Customer customer, AccountDetails accountDetails);
    Account get(int id);
    Account remove(int id);
}
