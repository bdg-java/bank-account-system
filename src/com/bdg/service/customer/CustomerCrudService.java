package com.bdg.service.customer;

import com.bdg.entity.Address;
import com.bdg.entity.Customer;
import com.bdg.storage.creditcard.CustomerStorage;


public class CustomerCrudService implements CustomerService {
    private CustomerStorage customerStorage = new CustomerStorage();

    @Override
    public String toString() {
        return "CustomerCrudService{" +
                "customerStorage=" + customerStorage +
                '}';
    }

    @Override
    public Customer create(String name, String surname, Address address) {
        Customer customer = new Customer(name, surname, address);
        if (customerStorage.add(customer)) {
            return customer;
        }

        return null;
    }

    @Override
    public Customer delete(int id) {
        return null;
    }

    @Override
    public Customer get(int id) {
        return null;
    }
}
