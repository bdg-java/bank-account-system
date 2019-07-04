package com.ashahbazyan.exceptions;

public class AddressNotFoundException extends RuntimeException {
    private final String errorMsg;

    public AddressNotFoundException(int id) {
        errorMsg = "Country with name " + id + " not found";
    }

    public String getMessage() {
        return errorMsg;
    }
}
