package com.ashahbazyan.exceptions;

public class CountryNotFoundException extends RuntimeException {
    private final String errorMsg;

    public CountryNotFoundException(String name) {
        errorMsg = "Country with name " + name + " not found";
    }
}
