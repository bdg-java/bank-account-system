package com.ashahbazyan.service.customer;

import com.ashahbazyan.dto.AddressCreationRequest;
import com.ashahbazyan.dto.CustomerCreationRequest;
import com.ashahbazyan.entity.Address;
import com.ashahbazyan.entity.Customer;
import com.ashahbazyan.exceptions.CustomerNotFoundException;
import com.ashahbazyan.service.BankAccountBaseService;
import com.ashahbazyan.service.address.AddressService;
import com.ashahbazyan.storage.MemoryStorage;
import com.ashahbazyan.storage.Storage;

public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {
    private Storage<Customer> memoryStorage = new MemoryStorage<>(10);
    private BankAccountBaseService<Address, AddressCreationRequest> addressService = new AddressService();

    @Override
    public Customer create(CustomerCreationRequest request) {
        Address address = addressService.create(request.addressCreationRequest);
        Customer customer = new Customer(request.firstName, request.lastName, address);
        return memoryStorage.add(customer);
    }

    @Override
    public Customer get(int id) {
        Customer customer = memoryStorage.get(id);
        if (customer == null) {
            throw new CustomerNotFoundException(id);
        }
        return customer;
    }

    @Override
    public Customer remove(int id) {
        Customer customer = memoryStorage.remove(id);
        if (customer == null) {
            throw new CustomerNotFoundException(id);
        }
        return customer;
    }
}
