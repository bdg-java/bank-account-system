package com.ashahbazyan.common;

import com.ashahbazyan.exceptions.CountryNotFoundException;

public enum Country {
    AM("Armenia"),
    FR("France"),
    GE("Germany"),
    RU("Russia");
    private String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public static Country findByName(String countryName) {
        for (Country country : Country.values()) {
            if(country.countryName == countryName){
                return country;
            }
        }
        throw new CountryNotFoundException(countryName);


    }
}
