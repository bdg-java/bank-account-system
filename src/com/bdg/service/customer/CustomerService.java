package com.bdg.service.customer;

import com.bdg.entity.Address;
import com.bdg.entity.Customer;

public interface CustomerService {
    Customer create(String name, String surname, Address address);
    Customer delete(int id);
    Customer get(int id);
}
