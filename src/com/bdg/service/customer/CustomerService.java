package com.bdg.service.customer;

import com.bdg.entity.Customer;

interface CustomerService {
    Customer create();
    Customer delete(int id);
    Customer get(int id);
}
