package com.ashahbazyan.service.address;

import com.ashahbazyan.common.Country;
import com.ashahbazyan.dto.AddressCreationRequest;
import com.ashahbazyan.entity.Address;
import com.ashahbazyan.service.BankAccountBaseService;
import com.ashahbazyan.storage.MemoryStorage;
import com.ashahbazyan.storage.Storage;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {
    private Storage<Address> addressStorage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public Address create(AddressCreationRequest request) {
        Address address = new Address(request.phoneNumber,
                request.street, Country.findByName(request.countryName));
        addressStorage.add(address);
        return address;
    }

    @Override
    public Address get(int id) {

        return null;
    }

    @Override
    public Address remove(int id) {
        return null;
    }
}
