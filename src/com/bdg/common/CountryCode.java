package com.bdg.common;

import com.bdg.common.exception.CountryCodeNotFoundException;

public enum CountryCode {
    ARM("+374", Country.AM);
    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    public CountryCode findCountryCode(String countryCode, Country country ){
        CountryCode found = null;
        CountryCode countryFound = null;

        for(CountryCode value : values()){
            if(value.name().equalsIgnoreCase(countryCode)){
                found = value ;
            }

            if(found == null){
                throw new CountryCodeNotFoundException(countryCode);
            }
        }
        return found;
    }
}
