package com.bdg.common.exception;

public class CountryNotFoundException extends  RuntimeException{
    private final String message;
    public CountryNotFoundException(String countryName) {

        this.message = "Country  {" + countryName+ "} do not found ...";
    }

    public String getMessage() {
        return this.message;
    }
}
