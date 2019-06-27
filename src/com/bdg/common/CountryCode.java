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

    public CountryCode findCountryCode(String codeOfCountry ){
        CountryCode found = null;

        for(CountryCode value : values()){
            if(value.name().equalsIgnoreCase(codeOfCountry)){
                found = value ;
            }
        }
        if(found == null){
            throw new CountryCodeNotFoundException(codeOfCountry);
        }
        return found;
    }
}
