package com.bdg.common.exception;

public class CountryCodeNotFoundException extends RuntimeException {
    private final String DEFAULT_MESSAGE = "%s code is not found";
    private final String message;

    public CountryCodeNotFoundException(String countryCode){
        this.message = String.format(DEFAULT_MESSAGE, countryCode);

    }

    public String getMessage(){
        return this.message;
    }



}
