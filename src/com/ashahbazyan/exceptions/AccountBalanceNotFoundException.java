package com.ashahbazyan.exceptions;

public class AccountBalanceNotFoundException extends RuntimeException {

    private String errorMsg;
    public AccountBalanceNotFoundException(int id){
        errorMsg = "Account with balance id "+ id + "not found";
    }
    public String getMessage() {
        return errorMsg;
    }
}
