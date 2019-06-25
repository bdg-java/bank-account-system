package com.bdg.common;

import com.bdg.common.exception.CountryNotFoundException;
import com.bdg.common.exception.NumericCodeNotFoundException;

public enum Country {
    AM("Armenia" ,"051");

    public String countryName;
    public String numercCode;
    Country(String countryName, String numercCode) {
        this.countryName = countryName;
        this.numercCode = numercCode;
    }

    public static Country findByName(String countryName, String numercCode) {
        Country found = null;
        Country numericFound = null;



        for (Country value : values()) {
            if (value.name().equalsIgnoreCase(countryName)) {
                found = value;
            }
            if (value.name().equalsIgnoreCase(numercCode)) {
                numericFound = value;
            }
        }
        if (found == null) {
            throw new CountryNotFoundException(countryName);
        }

        if(numericFound == null){
            throw new NumericCodeNotFoundException(numercCode);
        }
        return found;

    }
}
