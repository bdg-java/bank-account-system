package com.bdg.common;

import com.bdg.common.exception.CountryNotFoundException;

public enum Country {
    AM("Armenia" ,"051");

    public String countryName;
    public String numercCode;
    Country(String countryName, String numercCode) {
        this.countryName = countryName;
        this.numercCode = numercCode;
    }

    public static Country findByName(String countryName) {
        Country found = null;




        for (Country value : values()) {
            if (value.name().equalsIgnoreCase(countryName)) {
                found = value;
            }
        }
        if (found == null) {
            throw new CountryNotFoundException(countryName);
        }

        return found;

    }
}
