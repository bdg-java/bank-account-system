package com.ashahbazyan.exceptions;

public class AddressNotFoundException extends RuntimeException {
    private final String errorMsg;

    public AddressNotFoundException(String name) {
        errorMsg = "Country with name " + name + " not found";
    }
}
