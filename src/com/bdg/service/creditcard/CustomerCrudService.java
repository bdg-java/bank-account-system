package com.bdg.service.creditcard;

import com.bdg.common.exception.CustomerNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.Address;
import com.bdg.entity.Customer;
import com.bdg.storage.customer.CustomerStorage;

import java.time.LocalDate;


public class CustomerCrudService implements CustomerService {

    private final CustomerStorage customerStorage = new CustomerStorage();
    public int currentIndex = 0;

    public Customer create(String customerName, String customerSurName, Address customerAddress) {
        final Customer customer = new Customer(customerName, customerSurName, customerAddress );
        if(customerStorage.add(customer)) {
                 currentIndex++;
                return customer;

            }
        return null;

    }

    public Customer get(int id) {
        AbstractBankEntity card = customerStorage.get(id);
        if (card == null) {
            throw new CustomerNotFoundException(id);
        }
        return (Customer) card;
    }

    public Customer remove(int id) {
        AbstractBankEntity cuustomers =  customerStorage.get(id);
        cuustomers.setDeleted(LocalDate.now());
        currentIndex--;
        if (cuustomers == null) {
            throw new CustomerNotFoundException(id);
        }
        return (Customer) cuustomers;
    }


}
