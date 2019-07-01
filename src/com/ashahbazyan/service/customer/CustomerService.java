package com.ashahbazyan.service.customer;

import com.ashahbazyan.dto.CustomerCreationRequest;
import com.ashahbazyan.entity.Customer;
import com.ashahbazyan.service.BankAccountBaseService;

public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {
    @Override
    public Customer create(CustomerCreationRequest request) {
        return null;
    }
}
