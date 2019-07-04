package com.ashahbazyan;

import com.ashahbazyan.common.Country;
import com.ashahbazyan.dto.AddressCreationRequest;
import com.ashahbazyan.dto.CustomerCreationRequest;
import com.ashahbazyan.entity.Address;
import com.ashahbazyan.entity.Customer;
import com.ashahbazyan.service.customer.CustomerService;
import com.ashahbazyan.storage.FileStorage;
import com.ashahbazyan.storage.MemoryStorage;
import com.ashahbazyan.storage.Storage;

import java.io.IOException;

public class BankAccountSystemApplication {

    public static void main(String[] args)throws IOException {
//        AddressCreationRequest addressCreationRequest =
//                new AddressCreationRequest("34","34", Country.AM);
//        CustomerCreationRequest customerCreationRequest =
//                new CustomerCreationRequest("ar","sh",addressCreationRequest);
//        CustomerService customerService = new CustomerService();
//        customerService.create(customerCreationRequest);
//        System.out.println(customerService.get(1));
        Storage<?> fileStorage = new FileStorage<>("ashahbazyan","customer","txt");
        System.out.println(fileStorage.get(1));

    }
}
