package com.bdg.service.creditcard;

import com.bdg.common.CountryCode;
import com.bdg.common.PhoneType;
import com.bdg.common.exception.PhoneTypeNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.PhoneNumber;
import com.bdg.storage.phoneNumber.PhoneNumberStorage;
import com.bdg.storage.Storage;

import java.time.LocalDate;

public class PhoneNumberCrudService implements PhoneNumberService {

    private final Storage phoneNumbers = new PhoneNumberStorage();
    public int currentIndex = 0;

    public PhoneNumber create(CountryCode countryCode, String number, PhoneType phoneType) {

        final PhoneNumber phonenumbers = new PhoneNumber(countryCode, number, phoneType);
        if (phoneNumbers.add(phonenumbers)) {
            currentIndex++;
            return phonenumbers;
        }
        return null;
    }

    public PhoneNumber get(int id) {
        AbstractBankEntity number = phoneNumbers.get(id);
        if (number == null) {
            throw new PhoneTypeNotFoundException(id);
        }
        return (PhoneNumber) number;
    }

    public PhoneNumber remove(int id) {
        AbstractBankEntity cuustomers =  phoneNumbers.get(id);
        cuustomers.setDeleted(LocalDate.now());
        currentIndex--;
        if (cuustomers == null) {
            throw new PhoneTypeNotFoundException(id);
        }
        return (PhoneNumber) cuustomers;
    }
    
    
}
