package com.bdg.service.account.customer;

import com.bdg.entity.Address;
import com.bdg.entity.Customer;

public interface CustomerService {
    Customer create(String name, String surname, Address address);
    boolean delete(int id);
    Customer get(int id);
    Customer update(int id,String name,String surname,Address address);
}
