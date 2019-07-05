package com.bdg.service.creditcard;

import com.bdg.common.CountryCode;
import com.bdg.common.PhoneType;
import com.bdg.entity.PhoneNumber;

public interface PhoneNumberService {
    PhoneNumber create(CountryCode countryCode, String number, PhoneType phoneType);
    PhoneNumber get(int id);
    PhoneNumber remove(int id);
}
