package com.bdg.service.creditcard;

import com.bdg.common.PhoneType;
import com.bdg.entity.Address;
import com.bdg.entity.Customer;
import com.bdg.storage.Customer.CustomerStorage;


public class CustomerCrudService implements CustomerService {

    private final CustomerStorage obj = new CustomerStorage();

    public Customer create(String customerName, String customerSurName, Address customerAddress) {
        final Customer customer = new Customer(customerName, customerSurName, customerAddress );
          return customer;

    }

}
