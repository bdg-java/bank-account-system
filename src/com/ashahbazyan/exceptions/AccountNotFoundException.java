package com.ashahbazyan.exceptions;

public class AccountNotFoundException extends RuntimeException {
    private String errorMsg;

   public AccountNotFoundException(int id) {
        errorMsg = "Acount with id " + id + " not found";
    }
    public String getMessage() {
        return errorMsg;
    }
}
