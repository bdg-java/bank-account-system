package com.ashahbazyan.exceptions;

public class CreditCardNotFoundException extends RuntimeException {

    private final String errorMsg;

    public CreditCardNotFoundException(int id) {
        errorMsg = "Credit Card with id " + id + " not found";
    }
}
