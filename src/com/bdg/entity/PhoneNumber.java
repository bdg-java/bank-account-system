package com.bdg.entity;

import com.bdg.common.enums.CountryPhoneCode;
import com.bdg.common.enums.PhoneType;

public class PhoneNumber {
    private CountryPhoneCode countryPhoneCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryPhoneCode countryPhoneCode, String number, PhoneType type) {
        this.countryPhoneCode = countryPhoneCode;
        this.number = number;
        this.type = type;
    }
}
