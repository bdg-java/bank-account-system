package com.bdg.service.customer;

import com.bdg.entity.Address;
import com.bdg.entity.Customer;

public interface CustomerService {
    Customer create(String name, String surname, Address address);
    boolean delete(int id);
    Customer get(String name);
    Customer update(int id,String name,String surname,Address address);
}
