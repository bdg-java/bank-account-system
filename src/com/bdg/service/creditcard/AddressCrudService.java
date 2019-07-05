package com.bdg.service.creditcard;

import com.bdg.common.Country;
import com.bdg.common.exception.AddressNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.Address;
import com.bdg.entity.PhoneNumber;
import com.bdg.storage.address.AddressStorage;

import java.time.LocalDate;

public class AddressCrudService implements AddressService{
    private final AddressStorage addressStorage = new AddressStorage();
    public int currentIndex = 0;

    public Address create(Country country, String street, PhoneNumber[] phoneNumbers){
      final Address addresses = new Address(country, street, phoneNumbers);
      if(addressStorage.add(addresses)){
          currentIndex++;
          return addresses;
      }
      return null;
    }
    public Address get(int id) {
        AbstractBankEntity addr = addressStorage.get(id);
        if (addr == null) {
            throw new AddressNotFoundException(id);
        }
        return (Address) addr;
    }

    public Address remove(int id) {
        AbstractBankEntity addr = addressStorage.get(id);
        addr.setDeleted(LocalDate.now());
        currentIndex--;
        if (addr == null) {
            throw new AddressNotFoundException(id);
        }
        return (Address) addr;
    }
}
