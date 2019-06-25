package com.bdg.service.creditcard;

import com.bdg.entity.Address;
import com.bdg.entity.Customer;

interface CustomerService {
    Customer create(String customerName, String customerSurName, Address customerAddress);

}
