package com.bdg.service.creditcard;

import com.bdg.common.Country;
import com.bdg.entity.Address;
import com.bdg.entity.PhoneNumber;

interface AddressService {
    Address create(Country country, String steet, PhoneNumber[] phoneNumber);
    Address get(int id);
    Address remove(int id);

}
