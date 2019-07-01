package com.ashahbazyan.service.address;

import com.ashahbazyan.dto.AddressCreationRequest;
import com.ashahbazyan.entity.Address;
import com.ashahbazyan.service.BankAccountBaseService;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {
    @Override
    public Address create(AddressCreationRequest request) {
        return null;
    }
}
