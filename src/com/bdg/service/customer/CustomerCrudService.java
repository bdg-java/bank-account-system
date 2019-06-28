package com.bdg.service.customer;

import com.bdg.common.exception.CustomerNotFoundException;
import com.bdg.entity.Address;
import com.bdg.entity.Customer;
import com.bdg.storage.customer.CustomerStorage;

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
    public boolean delete(int id) {
        if (customerStorage.remove(id)) {
            return true;
        }
        throw new CustomerNotFoundException(id);
    }

    @Override
    public Customer get(int id) {
        Customer customer = customerStorage.get(id);
        if (customer == null) {
            throw new CustomerNotFoundException(id);
        }
        return customer;
    }

    public Customer update(int id, String name, String surname, Address address) {
        if (customerStorage.update(id, name, surname, address) == null) {
            throw new CustomerNotFoundException(id);
        }
        return null;
    }
}
